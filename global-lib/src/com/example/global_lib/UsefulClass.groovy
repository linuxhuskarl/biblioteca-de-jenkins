/**
 * File 'src/com/example/global_lib/UsefulClass.groovy'
 * Library 'global_lib'
 * Class 'UsefulClass'
 */

package com.example.global_lib

class UsefulClass {
    float x,y,z
    def somePublicMethod (name='default') {
        echo "name: `$name` (x=$x, y=$y, z=$z)"
    }
}