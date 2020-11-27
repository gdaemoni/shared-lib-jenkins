#!groovy

def call(Map config) {


	pipeline {
    agent any

	stages {
		stage('print config') {
			steps {
				print(config.test)
				sh "echo ${config.test}"
				echo "${config.test}"
			}
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