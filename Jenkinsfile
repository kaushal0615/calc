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
        stage('Run Tests') {
            steps {
                script {
                    sh 'mvn test'
                }
            }
        }
        stage('Build the Docker Image'){
            steps{
                script{
                    sh 'docker build -t kaushal15/demo .'
                }
            }
        }
        stage('Push the Image to Docker'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'kp07', variable: 'kaushal')]) {
                    sh 'docker login -u kaushal15 -p ${kaushal}'
                    }
                    sh 'docker push kaushal15/demo'
                }
            }
        }
        stage('Remove the Existing Container') {
            steps {
                script {
                    // Stop and remove the existing container named "calc"
                    sh 'docker stop calc || true'
                    sh 'docker rm calc || true'
                }
            }
        }
        stage('Run Ansible Playbook') {
            steps {
                script {
                    ansiblePlaybook(
                        playbook: 'deploy.yml',
                        inventory: 'inventory'
                     )
                }
            }
        }
        
    }
}
