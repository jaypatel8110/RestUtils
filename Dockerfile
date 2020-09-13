FROM openjdk:14
ADD target/RestUtil.jar RestUtil.jar
EXPOSE 8085
ENTRYPOINT ["java" ,"-jar","RestUtil.jar"]