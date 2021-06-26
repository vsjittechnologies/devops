FROM java:8
ADD /target/medilab-morning-preclinic-war.war medilab-morning-preclinic.war
CMD [ "java","-jar","medilab-morning-preclinic.war" ]