# Use an official OpenJDK 17 runtime as a parent image
FROM amazoncorretto:17.0.11-alpine3.19

# Set the working directory in the container
WORKDIR /app

# Copy the application's JAR file to the container
COPY ./build/libs/service-transaction-verification-1.0.jar service-transaction-verification-1.0.jar

# Expose the port the application runs on
EXPOSE 50053

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "service-transaction-verification-1.0.jar"]