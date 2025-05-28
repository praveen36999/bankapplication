# Extend the existing image
FROM eclipse-temurin:21-jdk

# Install curl and bash
RUN apt-get update && apt-get install -y curl bash

COPY target/eurekaserver-0.0.1-SNAPSHOT.jar eurekaserver-0.0.1-SNAPSHOT.jar

ENTRYPOINT  ["java","-jar","eurekaserver-0.0.1-SNAPSHOT.jar"]