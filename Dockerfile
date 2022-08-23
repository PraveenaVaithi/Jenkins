FROM openjdk:18
EXPOSE 8081
ADD target/jenkins.jar jenkins.jar
ENTRYPOINT ["java","-jar","/jenkins.jar"]
