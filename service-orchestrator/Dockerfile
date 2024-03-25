FROM openjdk:17-jdk-alpine

VOLUME /tmp

ARG JAR_FILE

COPY $JAR_FILE orcherstrator-service.jar

ENTRYPOINT ["java", "-jar", "/orcherstrator-service.jar"]