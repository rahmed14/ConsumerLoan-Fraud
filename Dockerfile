FROM eclipse-temurin:8-jre
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 9094
ENTRYPOINT ["java","-jar","app.jar"]