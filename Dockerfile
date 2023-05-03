FROM openjdk:11
EXPOSE 8000
COPY "/target/spring-mongo-article-0.0.1-SNAPSHOT.jar" app.jar
CMD ["java", "-jar", "app.jar"]