FROM amazoncorretto: 17-alpine-jdk
MAINTAINER gonzaa
COPY target/PruebaFinal-0.0.1-SNAPSHOT.jar PruebaFinal-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/PruebaFinal-0.0.1-SNAPSHOT.jar"]
