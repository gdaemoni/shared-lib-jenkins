#!groovy

def call(body) {
  def pipelineParams= [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = pipelineParams
  body()

  pipeline {
    agent any

    stages {
    //   stage('Checkout') {
    //     steps {
    //       checkout scm
    //     }
    //   }
    //   stage('Get Dockerfile') {
    //     steps {
    //       script {
    //         def tmpFile = libraryResource 'Dockerfile'
    //         writeFile file: 'Dockerfile', text: tmpFile
    //       }
    //     }
    //   }
      stage('Build') {
        steps {
          script {
            echo "test"
          }
        }
      }
    }
  }
}