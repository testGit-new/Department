pipeline {
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
    }
}
