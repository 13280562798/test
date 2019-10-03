package com.example.practise;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.practise.dao")
public class PractiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(PractiseApplication.class, args);
	}

}
