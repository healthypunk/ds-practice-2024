FROM openjdk:17-jdk-alpine

VOLUME /tmp

EXPOSE 50054

ARG JAR_FILE

COPY $JAR_FILE order-queue-service.jar

ENTRYPOINT ["java", "-jar", "/order-queue-service.jar"]
