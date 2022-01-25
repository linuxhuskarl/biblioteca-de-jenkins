/*
 * File '/vars/Log.groovy'
 * Library 'project-lib'
 */

public void somePublicFunction () {
    echo 'Calling privateFunction'
    privateFunction ()
    echo 'Done'
}

private void privateFunction () {
    echo 'Hello from privateFunction () in project-lib'
}
