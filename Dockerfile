# Stage 1: Build the application using Maven
FROM maven:3.9.1-eclipse-temurin-17 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml and the source code to the container
COPY pom.xml /app/
COPY src /app/src

# Build the application (skip tests to speed up the build process) and output build logs
RUN mvn clean package -DskipTests -X

# Stage 2: Create the final image with only the JAR file
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/StudentManagement1-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the Spring Boot application runs on (default is 8080)
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
