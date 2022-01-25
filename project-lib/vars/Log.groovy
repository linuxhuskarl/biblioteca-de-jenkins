/*
 * File '/vars/Log.groovy'
 * Library 'project_lib'
 */

public void somePublicFunction () {
    echo 'Calling privateFunction'
    privateFunction ()
    echo 'Done'
}

private void privateFunction () {
    echo 'Hello from privateFunction () in project_lib'
}
