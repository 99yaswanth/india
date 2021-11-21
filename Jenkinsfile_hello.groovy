//Declerative pipeline

pipeline{
    agent any
    stages{
        stage("clone code"){
            steps{
                println "clone code from git"
            }
        }
        stage("build"){
            steps{
                println "build code"
            }
        }
        
    }
}