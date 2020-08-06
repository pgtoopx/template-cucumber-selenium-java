pipeline {
  agent none
  stages {
    stage('Integration Test') {
      agent {
        docker {
          image 'markhobson/maven-chrome'
        }

      }
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