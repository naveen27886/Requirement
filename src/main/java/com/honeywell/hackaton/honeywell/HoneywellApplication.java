package com.honeywell.hackaton.honeywell;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="com.honeywell.hackaton.honeywell")
@PropertySource(value="classpath:application.properties")
//@EnableJpaRepositories(repositoryFactoryBeanClass=StudentRepository.class)
public class HoneywellApplication {
	
	@Autowired
	DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(HoneywellApplication.class, args);
	}

}
