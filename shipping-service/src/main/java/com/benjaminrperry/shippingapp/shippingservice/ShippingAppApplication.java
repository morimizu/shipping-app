package com.benjaminrperry.shippingapp.shippingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
public class ShippingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShippingAppApplication.class, args);
	}

}
