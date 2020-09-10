FROM openjdk:8
ADD target/rest-0.0.1-SNAPSHOT.jar RestUtil.jar
EXPOSE 8085
ENTRYPOINT ["java" ,"-jar","RestUtil.jar"]