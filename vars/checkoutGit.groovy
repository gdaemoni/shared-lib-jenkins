#!groovy

def call(body) {
	def config = [:]
	
	body.resolveStrategy = Closure.DELEGATE_FIRST
	body.delegate = config
	body()

	echo "texxxxt"
	
	git url: config.url,
		branch: config.branch,
		credentialsId: config.credentialsId
}
