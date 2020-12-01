# rabbitmq-messaging-lab
Project to study rabbitmq together Spring Boot framework

## How to execute

* Create an image of Rabbitmq and run it
```bash
$ docker build -t rabbitmq-manager rabbitmq-messaging-lab-rabbitmq-image/
$ docker run -p 5672:5672 --name rabbitmq-manager rabbitmq-manager
```

* In another terminal, create an image of Spring Boot application and run it
```bash
$ docker build -t rabbitmq-messaging-lab-backend rabbitmq-messaging-lab-backend/
$ docker run --name rabbitmq-messaging-lab-backend --network host -p 8080 rabbitmq-messaging-lab-backend
```