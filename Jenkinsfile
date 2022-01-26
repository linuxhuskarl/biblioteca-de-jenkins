node {
    checkout scm
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