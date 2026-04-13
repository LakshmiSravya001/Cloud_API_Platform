FROM openjdk:17
COPY target/cloud-api-0.0.1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]