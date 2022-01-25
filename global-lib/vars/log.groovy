/*
 * File 'vars/log.groovy'
 * Library 'global_lib'
 */

def somePublicFunction () {
    println 'Calling privateFunction'
    privateFunction ()
    println 'Done'
}

def privateFunction () {
    println 'Hello from privateFunction () in global_lib'
}

