#!groovy

def call(def url, def branch = "master", def credentialsId = "") {
	echo "texxxxt"
	git url: url
		branch: branch
		credentialsId: credentialsId
}
