FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
EXPOSE 8080
COPY ./target/devops-integration.jar devops-integration.jar
ENTRYPOINT ["java", "-jar", "/devops-integration.jar"]