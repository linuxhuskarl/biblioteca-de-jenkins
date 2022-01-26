@Library('SecretProjectLibrary') _
@Library('Utilities')
import com.example.utils.*

node {
    checkout scm
    def doubler = new Calc(multiplier: 2)
    stage('Hello') {
        echo "doubler.doMath(4) = ${doubler.doMath(4)}"
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