FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} departmentservice.jar
ENTRYPOINT ["java","-jar","/departmentservice.jar"]
EXPOSE 9001