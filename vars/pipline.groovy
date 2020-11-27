#!groovy

def call(Map config) {


	pipeline {
    agent any

	stages {
		stage('checkout') {
			steps {
				git url: config.url
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