From openjdk:11
RUN mkdir /app
WORKDIR /app
COPY target/DockerAndKubernatesDemo-0.0.1-SNAPSHOT.jar /app
EXPOSE 8991
ENTRYPOINT ["java", "-jar", "DockerAndKubernatesDemo-0.0.1-SNAPSHOT.jar"]
