package com.kn.web;

import kn.esi.model.TestEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
		TestEntity testRepostory = new TestEntity(1);
		var ve= testRepostory.getId();
		var v = testRepostory.id;
	}

}
