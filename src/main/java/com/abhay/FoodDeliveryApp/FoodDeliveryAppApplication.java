package com.abhay.FoodDeliveryApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class FoodDeliveryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodDeliveryAppApplication.class, args);
	}

}
 