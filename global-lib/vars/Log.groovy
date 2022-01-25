/*
 * File 'vars/Log.groovy'
 * Library 'global-lib'
 */

public void somePublicFunction () {
    echo 'Calling privateFunction'
    privateFunction ()
    echo 'Done'
}

private void privateFunction () {
    echo 'Hello from privateFunction ()'
}

