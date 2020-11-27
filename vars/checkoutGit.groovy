#!groovy

def call(Map args) {
	def url = argc.url
	def br = args.branch
	def credentialsId = args.credentialsId

	return {
		stage ("checkout ${br}") {
			git url: url
				branch: branch
				credentialsId: credentialsId
		}
	}
}