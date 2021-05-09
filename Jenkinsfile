pipeline{
    agent any
    stages{
        stage("Build"){
            steps{
                sh "mvn clean install"    
            }
        }
        stage("Deploy"){
            steps{
              sh "java -jar medilab-morning-preclinic-war-0.0.1-SNAPSHOT.war"    
            }
            
        }
    }
}
