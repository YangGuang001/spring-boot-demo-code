package com.springboot.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class RabbitmqApplication implements CommandLineRunner{

	@Autowired
	RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqApplication.class, args);
	}

	@Bean
	public Queue myqueue() {
		return new Queue("my-queue");
	}

	@Override
	public void run(String... args) throws Exception {
		rabbitTemplate.convertAndSend("my-queue", "rabbitmq message");
	}
}
