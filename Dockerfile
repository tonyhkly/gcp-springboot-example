FROM openjdk:17-jdk-alpine

WORKDIR /app
COPY build.gradle .
COPY src ./src

RUN ./gradlew build -x test

COPY build/libs/gcp-springboot-example-0.0.1-SNAPSHOT.jar gcp-springboot-example-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/gcp-springboot-example-0.0.1-SNAPSHOT.jar"]
