package io.chaosity.api.db.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "io.chaosity.api.db.sample.repos")
@SpringBootApplication

public class ApiDbSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDbSampleApplication.class, args);
	}

}
