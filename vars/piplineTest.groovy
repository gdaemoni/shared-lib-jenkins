#!groovy

def call(body) {
    // evaluate the body block, and collect configuration into the object
    def pipelineParams= [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams
    body()


	stage ('www') {
		echo pipelineParams.branch
	}
	// pipeline {
    // agent any

	// stages {
	// 	stage('checkout') {
	// 		steps {
	// 			git url: config.url,
	// 				branch: config.branch,
	// 				credentialsId: config.credentialsId
	// 		}
	// 	}
    // 	stage('Build') {
	// 		steps {
	// 			script {
	// 				echo "test"
    //     		}
    //     	}
    // 	}
    // }
 // }
}
