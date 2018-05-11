pipeline {
  agent any
  stages {
    stage('RestFullSpringBootDemo_Build') {
      steps {
        echo 'Construyendo...'
        build 'RestFullSpringBootDemo_Build '
      }
    }
    stage('Test') {
      steps {
        echo 'Testeando...'
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deploy...'
      }
    }
  }
}