FROM openjdk:17-jdk-alpine

ARG JAR_FILE=gcp-springboot-example-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-Djava.security.edg=file:/dev/./urandom","-jar","/app.jar"]
