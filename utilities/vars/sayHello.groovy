/**
* vars/sayHello.groovy
* Custom step to echo parametrized hello
*/

def call(String name = 'human') {
    echo "Hello, ${name}."
}
