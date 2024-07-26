FROM bellsoft/liberica-openjdk-alpine:17.0.3

WORKDIR /usr/share/app

EXPOSE 8080

COPY target/*.jar app.jar

CMD ["java", "-jar", "app.jar"]