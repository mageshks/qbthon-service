FROM adoptopenjdk/openjdk8:alpine-jre
ADD target/qbthon-service-0.0.1-SNAPSHOT.jar qbapp.jar
ENTRYPOINT ["java","-jar","qbapp.jar"]