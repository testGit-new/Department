pipeline {
    environment{
    registry ='anumishra/department'
   registryCredential = 'docker_id'
    dockerImage =''
  }
    agent any

    stages {
        stage('Hello Hi') {
            steps {
                echo 'Hello World anu'
            }
        }
        stage('Git Clone'){
            steps{
                git branch: 'main', url: 'https://github.com/testGit-new/Department.git'
            }
        }
        
        stage('Build Image'){
            steps{
                script{
          dockerImage = docker.build registry + ':$BUILD_NUMBER'
          }            
            }
            
        }
        stage('Push the image on docker hub'){
        step{
          script{
            docker.withRegistry( '', registryCredential ) {
              dockerImage.push()
            }
        }
      
      }    
        }
    }
        
    

    
