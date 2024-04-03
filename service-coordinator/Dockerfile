FROM openjdk:17-jdk-alpine

VOLUME /tmp

EXPOSE 50055

ARG JAR_FILE

COPY $JAR_FILE order-queue-service.jar

ENTRYPOINT ["java", "-jar", "/coordinator-service.jar"]
