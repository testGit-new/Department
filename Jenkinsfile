pipeline{
  environment{
    registry ="anumishra/department"
    registryCredential = "anumishra"
    dockerImage =''
  }
  agent any{
    statges{
      stage('Pull the code from Git'){
        steps{
       git 'https://github.com/testGit-new/Department.git'
        }
      }
      
      stage('Building our Image'){
        steps{
          script{
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
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
            stage('Cleaning up') { 
31
            steps { 
32
                sh "docker rmi $registry:$BUILD_NUMBER" 
33
            }
34
            }

  }
}
