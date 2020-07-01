package com.kafka.kafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.kafkaconsumer.model.User;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "Kafka_Example", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Consumed message : "+ message);
	}
	
	@KafkaListener(topics = "Kafka_Example_json", groupId = "group_json",
			containerFactory = "userkafkaListenerContainerFactory")
	public void consumeUser(User user) {
		System.out.println("Consumed user : "+ user);
	}
}
