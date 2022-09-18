package com.example.SpringbootMybatis02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example" )
@MapperScan("com.example.repository")
public class SpringbootMybatis02Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatis02Application.class, args);
	}

}
