FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy the application JAR file
COPY target/myapp.jar app.jar

# Expose port (if your application runs on a specific port, e.g., 8080)
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
