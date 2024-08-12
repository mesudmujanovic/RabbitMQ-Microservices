<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-amqp</artifactId>
</dependency>

RabbitMQ - Docker files link https://hub.docker.com/_/rabbitmq

Command Promt [
docker pull rabbitmq:3.10.5-management,                                 
docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3.10.5-management
]

![RabbitMQ Architecture](https://github.com/user-attachments/assets/fe6eb04a-8628-4048-bb7d-14cd503ce239)
