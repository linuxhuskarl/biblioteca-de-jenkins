/**
 * File 'src/com/example/project-lib/UsefulClass.groovy'
 * Library 'project-lib'
 * Class 'UsefulClass'
 */

class UsefulClass {
    String name
    def somePublicMethod(name = "default") {
        this.name = name
        echo "name: ${this.name}"
    }
}