FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/*.jar restutil.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","restutil.jar"]