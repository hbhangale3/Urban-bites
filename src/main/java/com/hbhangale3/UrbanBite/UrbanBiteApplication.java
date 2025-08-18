package com.hbhangale3.UrbanBite;

import com.hbhangale3.UrbanBite.email_notification.dtos.NotificationDTO;
import com.hbhangale3.UrbanBite.email_notification.services.NotificationService;
import com.hbhangale3.UrbanBite.enums.NotificationType;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
//@RequiredArgsConstructor
public class UrbanBiteApplication {

//    	private final NotificationService notificationService;

	public static void main(String[] args) {
		SpringApplication.run(UrbanBiteApplication.class, args);
	}

//    	@Bean
//        CommandLineRunner runner(){
//		return args -> {
//			NotificationDTO notificationDTO = NotificationDTO.builder()
//					.recipient("hbhangale3@gmail.com" )
//					.subject("Hello Harsh")
//					.body("Hey this is a test email")
//					.type(NotificationType.EMAIL)
//					.build();
//
//			notificationService.sendEmail(notificationDTO);
//		};
//	}


}
