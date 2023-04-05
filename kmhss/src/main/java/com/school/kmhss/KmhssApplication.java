package com.school.kmhss;
import com.school.controllers.SchollController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan("com.school.entity")
@ComponentScan(basePackageClasses = SchollController.class)
@EnableJpaRepositories("com.school.repository")
public class KmhssApplication {

	public static void main(String[] args) {
		SpringApplication.run(KmhssApplication.class, args);
	}

}
