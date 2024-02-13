pipeline {
    agent any
    tools{
        maven "maven"
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/kaushal0615/calc.git']])
                sh 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t kaushal15/demo .'
                }
            }
        }
        stage('push image to docker'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'kp07', variable: 'kaushal')]) {
                    sh 'docker login -u kaushal15 -p ${kaushal}'
                    }
                    sh 'docker push kaushal15/demo'
                }
            }
        }
    }
}