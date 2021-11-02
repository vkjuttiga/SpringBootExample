FROM openjdk:12-jdk-alpine

COPY target/spring-boot-demo-0.0.1-SNAPSHOT.jar sp.jar

EXPOSE 8012

ENTRYPOINT ["java","-jar","/sp.jar"]
