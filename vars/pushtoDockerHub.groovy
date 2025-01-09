def call() {
      sh """
        echo ${DOCKERHUB_CREDS_PSW} | docker login -u ${DOCKERHUB_CREDS_USR} --password-stdin
        docker push ${env.IMAGE_NAME} 
    """
}