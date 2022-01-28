@Library('SecretProjectLibrary')
import com.example.secret.*
@Library('Utilities')
import com.example.utils.*

def doubler = new Calc(multiplier: 2)
def secret = new Secret(
    hostname: "www.example.com",
    username:"root",
    password:"toor"
)
/* BEGIN Scripted Pipeline *
node {
    checkout scm
    stage('Hello') {
        echo "doubler.doMath(4) = ${doubler.doMath(4)}"
        echo secret.sshCommand()
        getURLContents('http://www.example.com')
    }
    stage('Build') {
        sh 'make'
    }
    stage('Test') {
        sh 'make check || true'
    }
    stage('Deploy') {
        if (currentBuild.result == null || currentBuild.result == 'SUCCESS') { 
            sh 'make publish'
        }
    }
}
/* END Scripted Pipeline */
/* BEGIN Declarative Pipeline */
pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                echo "${doubler.doMath(4)}"
                echo secret.sshCommand()
                getURLContents('http://www.example.com')
            }
        }
        stage('Build') {
            steps {
                checkout scm
                sh 'make'
            }
        }
        stage('Test') {
            steps {
                sh 'make check'
            }
        }
    }
    post {
        success {
            sh 'make publish'
        }
        failure {
            mail to: 'admin@example.com', 
            subject: "Build ${BUILD_ID} failed",
            body: "I'm sorry :("
        }
    }
}
/* END Declarative Pipeline */
