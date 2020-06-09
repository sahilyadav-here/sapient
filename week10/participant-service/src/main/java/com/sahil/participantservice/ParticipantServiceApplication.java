package com.sahil.participantservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class ParticipantServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParticipantServiceApplication.class, args);
	}

}
