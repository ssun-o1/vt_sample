package com.sunsc.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VtWebfluxApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(VtWebfluxApplication.class);
		application.setWebApplicationType(WebApplicationType.REACTIVE);
		application.run(args);
	}

}
