/**
 * File 'src/com/example/global-lib/UsefulClass.groovy'
 * Library 'global-lib'
 * Class 'UsefulClass'
 */

class UsefulClass {
    float x,y,z
    def somePublicMethod (name='default') {
        echo "name: `$name` (x=$x, y=$y, z=$z)"
    }
}