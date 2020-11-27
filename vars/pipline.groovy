#!groovy

def call(body) {
	def pipelineParams= [:]
	body.resolveStrategy = Closure.DELEGATE_FIRST
	body.delegate = pipelineParams
	body()

	pipeline {
    agent any

	stages {
		stage('print config') {
			echo "${pipelineParams.supertest}"
		}
	
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