// src/com/example/Bar.groovy
package com.example

import groovy.json.JsonSlurper

// Something in 3D space
class Bar {
    float x, y, z
    def printItself () {
        println("--- com.example.Bar (x=${x}, y=${y}, z=${z}) ---")
    }
    def printResource () {
        def fbar = libraryResource 'com/example/bar.json'
        println("${fbar}")
    }
}
