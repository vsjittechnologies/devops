FROM java:8
ADD C:/Users/bprayaga/.jenkins/workspace/medilab-preclinic-pipeline/target/medilab-morning-preclinic-war-0.0.1-SNAPSHOT.war medilab-morning-preclinic.war
CMD [ "java","-jar","medilab-morning-preclinic.war" ]
