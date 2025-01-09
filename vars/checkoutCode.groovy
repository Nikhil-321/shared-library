def call() {
    checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: '01675765-6910-4cb5-b9be-9eeabe692c5d', url: 'https://github.com/Nikhil-321/social-media-react.git']])
    echo 'Git checkout completed'
}
