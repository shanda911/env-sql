FROM openjdk:8-jdk-alpine
ENV TEST_ENV0=testFromDockerFile
COPY target/env-sql.jar env-sql.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/env-sql.jar"]