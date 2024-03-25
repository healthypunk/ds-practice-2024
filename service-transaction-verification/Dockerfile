FROM openjdk:17-jdk-alpine

VOLUME /tmp

EXPOSE 50052

ARG JAR_FILE

COPY $JAR_FILE transaction-verification-service.jar

ENTRYPOINT ["java", "-jar", "/transaction-verification-service.jar"]