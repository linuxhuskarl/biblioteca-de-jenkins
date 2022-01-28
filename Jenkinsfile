@Library('SecretProjectLibrary')
import com.example.secret.*
@Library('Utilities')
import com.example.utils.*

node {
    checkout scm
    def doubler = new Calc(multiplier: 2)
    def secret = new Secret(
        hostname: "www.example.com",
        username:"root",
        password:"toor"
    )
    stage('Hello') {
        echo "doubler.doMath(4) = ${doubler.doMath(4)}"
        echo secret.sshCommand()
        getURLContents('www.example.com')
    }
    stage('Build') {
        echo 'Building....'
        sh 'make'
    }
    stage('Test') {
        echo 'Testing....'
        sh 'make check || true'
    }
    stage('Deploy') {
        echo 'Deploying....'
        if (currentBuild.result == null || currentBuild.result == 'SUCCESS') { 
            sh 'make publish'
        }
    }
}