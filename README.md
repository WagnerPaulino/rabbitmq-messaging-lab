# rabbitmq-messaging-lab
Project to study rabbitmq together Spring Boot framework

## How to execute

* Create an image of Rabbitmq and run it
```bash
$ docker build -t rabbitmq-manager rabbitmq-messaging-lab-rabbitmq-image/
$ docker run -p 5672:5672 -p 15672:15672 --name rabbitmq-manager rabbitmq-manager
```

* In another terminal, create an image of Spring Boot application and run it
```bash
$ docker build -t rabbitmq-messaging-lab-backend rabbitmq-messaging-lab-backend/
$ docker run --name rabbitmq-messaging-lab-backend --network host -p 8080:8080 rabbitmq-messaging-lab-backend
```

* In another terminal, create an image of Spring Boot application api and run it
```bash
$ docker build -t rabbitmq-messaging-lab-api rabbitmq-messaging-lab-api/
$ docker run --name rabbitmq-messaging-lab-api --network host -p 8081:8081 rabbitmq-messaging-lab-api
```

## How use

* There is one endpoint to test
```bash
curl -X POST http://localhost:8081/api/messages --header "Content-Type: application/json" --data '{"id": 1, "title": "some title", "content":"some content", "from": "some from", "to": "some to" }'
```