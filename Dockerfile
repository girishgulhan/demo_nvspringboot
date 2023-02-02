FROM openjdk:11-jdk-alpine
ADD target/nvspringboot.jar nvspringboot.jar
ENTRYPOINT ["java","-jar","nvspringboot.jar"]

