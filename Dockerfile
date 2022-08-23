FROM openjdk:18
EXPOSE 8081
ADD target/Jenkins.jar Jenkins.jar
ENTRYPOINT ["java","-jar","/Jenkins.jar"]
