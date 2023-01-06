package com.example.awsrds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;





@SpringBootApplication
//@OpenAPIDefinition(info = @Info(title="Address API",version="1.7",description="Address API"))
public class AwsRdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsRdsApplication.class, args);
	}

}
