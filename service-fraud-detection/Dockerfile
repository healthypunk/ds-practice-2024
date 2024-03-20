FROM openjdk:17-jdk-alpine

VOLUME /tmp

EXPOSE 50051

ARG JAR_FILE

COPY $JAR_FILE fraud-detection-service.jar

ENTRYPOINT ["java", "-jar", "/fraud-detection-service.jar"]
