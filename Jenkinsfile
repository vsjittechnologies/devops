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
              exec "java -jar ${WORKSPACE}\medilab-preclinic-pipeline\target\medilab-morning-preclinic-war-0.0.1-SNAPSHOT.war"    
            }
            
        }
    }
}
