// vars/dockerBuild.groovy
def call(Map stageParams) {
    sh """
        docker build -t ${stageParams.imageName}:${stageParams.tag} ${stageParams.context ?: '.'}
    """
    echo "Собран образ: ${stageParams.imageName}:${stageParams.tag}"
}
