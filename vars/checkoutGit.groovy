#!groovy

def call(def url, def branch = "master", def credentialsId = "") {
	return {
		stage ("checkout ${br}") {
			steps {
				git url: url
					branch: branch
					credentialsId: credentialsId
			}
		}
	}
}