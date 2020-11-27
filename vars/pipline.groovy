#!groovy

def call(Map config) {


	pipeline {
    agent any

	stages {
		stage('checkout') {
			steps {
				git url: config.url,
					branch: config.branch,
					credentailsId: config.credentialsId
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