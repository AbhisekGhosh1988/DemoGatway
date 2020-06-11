FROM openjdk:8-jdk-alpine
ADD target/demo-gateway-bluepay-0.0.1-SNAPSHOT.jar demo-gateway-bluepay-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["sh","-c","java -jar demo-gateway-bluepay-0.0.1-SNAPSHOT.jar"]
EXPOSE 8075
