FROM eclipse-temurin:21-jdk

# Install curl and bash
RUN apt-get update && apt-get install -y curl bash

COPY target/cards-0.0.1-SNAPSHOT.jar cards-0.0.1-SNAPSHOT.jar

ENTRYPOINT  ["java","-jar","cards-0.0.1-SNAPSHOT.jar"]






































































