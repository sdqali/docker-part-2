FROM openjdk:11

ADD "./sample-api/target/hello-0.0.1-SNAPSHOT.jar" .

CMD ["java", "-jar", "/hello-0.0.1-SNAPSHOT.jar"]
