package com.javawiz.sbthymeleafstartup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.javawiz")
public class SbThymeleafStartupApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbThymeleafStartupApplication.class, args);
	}
}
