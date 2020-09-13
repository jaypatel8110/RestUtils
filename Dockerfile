FROM openjdk:14
ADD target/RestUtil.jar RestUtil.jar
EXPOSE 8081
ENTRYPOINT ["java" ,"-jar","RestUtil.jar"]