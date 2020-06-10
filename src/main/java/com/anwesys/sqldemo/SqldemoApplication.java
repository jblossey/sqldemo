package com.anwesys.sqldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Query;

@SpringBootApplication(scanBasePackages = "com.anwesys")
public class SqldemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqldemoApplication.class, args);
	}

}