# Extend the existing image
FROM eclipse-temurin:21-jdk

# Install curl and bash
RUN apt-get update && apt-get install -y curl bash

COPY target/configserver-0.0.1-SNAPSHOT.jar configserver-0.0.1-SNAPSHOT.jar

ENTRYPOINT  ["java","-jar","configserver-0.0.1-SNAPSHOT.jar"]

# The CNB entrypoint and application are already set; no need to modify