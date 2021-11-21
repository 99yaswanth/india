pipeline{
    agent any
    stages{
        stage("hi"){
            steps{
                println "hi all"
            }
        }
    }
}