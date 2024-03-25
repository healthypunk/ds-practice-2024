FROM openjdk:17-jdk-alpine

VOLUME /tmp

EXPOSE 50053

ARG JAR_FILE

COPY $JAR_FILE suggestion-service-service.jar

ENTRYPOINT ["java", "-jar", "/suggestion-service-service.jar"]