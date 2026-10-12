@Library('jenkins-shared-library@main') _
pipeline {
    agent {
        docker {
            image 'jenkins/inbound-agent:latest'
            args '-u root'
        }
    }

    options {
        timeout(time: 15, unit: 'MINUTES')
        buildDiscarder(logRotator(numToKeepStr: '10'))
    }

    stages {
        stage('Check Environment') {
            steps {
                echo '=== Проверка окружения ==='
                sh 'echo "Hostname: $(hostname)"'
                sh 'uname -a'
                sh 'java -version'
                sh 'whoami'
                sh 'pwd'
            }
        }
    }

    post {
        always {
            echo '=== Сборка завершена ==='
        }
    }
}
