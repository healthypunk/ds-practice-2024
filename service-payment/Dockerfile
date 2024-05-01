FROM openjdk:17-jdk-alpine

VOLUME /tmp

EXPOSE 50054

ARG JAR_FILE

COPY $JAR_FILE payment-service.jar

ENTRYPOINT ["java", "-jar", "/payment-service.jar"]