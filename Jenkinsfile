pipeline {
  agent {
    docker {
      image 'markhobson/maven-chrome'
    }

  }
  stages {
    stage('Clean Work Space'){
        steps {
            sh 'mvn clean'
            }
         }
    stage('Integration Test') {
      steps {
        sh 'mvn test'
      }
    }
  }
  post {
    always {
      archiveArtifacts(artifacts: 'target/', fingerprint: true)
      junit 'target/cucumber.xml'
    }
  }
}
