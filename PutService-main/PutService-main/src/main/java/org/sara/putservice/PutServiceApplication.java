package org.sara.putservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("org.sara.putservice.entities")
public class PutServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(PutServiceApplication.class, args);
	}

}
