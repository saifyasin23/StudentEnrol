package enrolsystem

class BootStrap {

    def init = { servletContext ->

	def computing=new Course(

department: "Computing", courseCode: "CS123", courseTitle: "Bsc Hon Computing", courseLeader: "Dr Michelle Murphy", startDate: new Date('09/09/2019'), endDate: new Date('07/07/2023'), numberOfStudents: 55, studyMode: "Fulltime", tuitionFees: 9000, description: "This is a random piece of text").save()


	def student1=new Student(

studentName: "Joe", studentID: "12345", dob: new Date ('23/11/1990'), isFundingAvailable: true, studentEmail: "joe@gmail.com", studentUsername: "joe1234", studentPassword: "joe1231", course: "Computing").save()

	def student2=new Student(

studentName: "Tom", studentID: "12341", dob: new Date ('23/10/1990'), isFundingAvailable: false, studentEmail: "tom@gmail.com", studentUsername: "tom1234", studentPassword: "tom1231", course: "Computing").save()

	
	def lecturer1=new Lecturer(

fullName: "Michelle Murphy", post: "123", subject: "computers", lecturerEmail: "mm@gmail.com", office: "cantor", bio: "teacher for cantor").save()

	def lecturer2=new Lecturer(

fullName: "Harry Henry", post: "123", subject: "computers", lecturerEmail: "hh@gmail.com", office: "cantor", bio: "teacher for cantor").save()

	def module1=new Module(

module_title: "System Arch", module_code: "sa1", credits: 120, lecturer: "Dr Michelle Murphy", course: "Computing", description: "This is a random piece of text").save()

	def module2=new Module(

module_title: "Project Planning", module_code: "pps", credits: 120, lecturer: "Dr Michelle Murphy", course: "Computing", description: "This is a random piece of text").save()

    }
    def destroy = {
    }
}

