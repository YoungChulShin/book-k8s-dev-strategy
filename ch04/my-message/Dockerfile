FROM openjdk

COPY build/libs/my-message-0.0.1-SNAPSHOT.jar my-message-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "my-message-0.0.1-SNAPSHOT.jar", "--spring.profiles.active=prod"]