FROM maven:3.6.3-jdk-8

workdir spring-app

COPY . .
RUN mvn clean package

EXPOSE 8080

CMD ["java","-jar","target/rabbitmq-messaging-lab-backend-0.0.1-SNAPSHOT.jar"]