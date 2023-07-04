FROM openjdk:8u102-jre
COPY target/spring-mongo-cart.jar spring-mongo-cart.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-mongo-cart.jar"]