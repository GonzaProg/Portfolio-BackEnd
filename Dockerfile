FROM amazoncorretto: 18-alpine-jdk
MAINTAINER gonzaa
COPY target/PruebaFinal-0.0.1-SNAPSHOT.jar docker-miportfolio.jar
ENTRYPOINT ["java","-jar","/docker-miportfolio.jar"]
