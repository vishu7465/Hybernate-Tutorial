# Use Maven base image to build the application
FROM maven:3.8.6-openjdk-11 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the Maven pom.xml and source code into the container
COPY pom.xml .
COPY src ./src

# Download dependencies and build the application
RUN mvn clean package -DskipTests

# Use an OpenJDK base image to run the application
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app/target/Hybernate-mapping-0.0.1-SNAPSHOT.jar app.jar

# Specify the command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
