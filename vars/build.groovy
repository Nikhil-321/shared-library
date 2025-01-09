def call() {
    sh "docker build -t ${env.IMAGE_NAME} ."
    echo "Image build successful"
}