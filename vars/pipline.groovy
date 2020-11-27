#!groovy

def call(Map config) {


	pipeline {
    agent any

	stages {
		stage('print config') {
			steps {
				echo "${config.body}"
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