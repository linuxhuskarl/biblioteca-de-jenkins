/**
* vars/debugScript.groovy
* Custom step to execute script with simple additional echo
*/

def call(Closure body) {
    echo 'Calling a script block'
    script {
        body()
    }
}
