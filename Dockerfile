FROM openjdk:14
VOLUME /tmp
ADD target/RestUtil.jar RestUtil.jar
EXPOSE 8081
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","RestUtil.jar"]