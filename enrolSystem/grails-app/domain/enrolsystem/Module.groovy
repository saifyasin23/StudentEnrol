package enrolsystem

class Module {

String module_title

String module_code

int credits

String lecturer

String course

String description

    static constraints = {
	
	module_title blank: false, nullable: false

        module_code blank: false, nullable: false

	credits blank: false, nullable: false, minSize: 20, maxSize: 120

        lecturer blank: false, nullable: false

	description blank: false, nullable: false, maxSize:5000

    }
}
