#!groovy

def call(Map argc) {
	def url = argc.url
	def branch = args.branch
	def credentialsId = args.credentialsId

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