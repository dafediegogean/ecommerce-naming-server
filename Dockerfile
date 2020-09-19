FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ecommerce-naming-server.jar
ENTRYPOINT ["java","-jar","/ecommerce-naming-server.jar"]