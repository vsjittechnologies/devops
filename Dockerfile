FROM java:8
ADD  medilab-morning-preclinic-war-0.0.1-SNAPSHOT.war medilab-morning-preclinic.war
CMD [ "java","-jar","medilab-morning-preclinic.war" ]
