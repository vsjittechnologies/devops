FROM java:8
ADD ${WORKSPACE}/${JOB_NAME}/target/medilab-morning-preclinic-war-0.0.1-SNAPSHOT.war
CMD [ "java","-jar","medilab-morning-preclinic.war" ]
