package com.sahil.meetingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients("com.sahil.meetingservice")
public class MeetingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeetingServiceApplication.class, args);
	}

}
