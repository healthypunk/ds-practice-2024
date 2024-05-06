FROM openjdk:17-jdk-alpine

VOLUME /tmp

EXPOSE 50090

ARG JAR_FILE

COPY $JAR_FILE database-service.jar

ENTRYPOINT ["java", "-jar", "/database-service.jar"]
