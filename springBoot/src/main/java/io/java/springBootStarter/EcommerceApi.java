package io.java.springBootStarter;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication
//comments added for testing for pushing GitHub repo
@EnableAutoConfiguration
@ComponentScan(basePackages = {"io.java.controller","io.java.service"}) 
@Configuration
@EntityScan("io.java.dto")
@EnableJpaRepositories("io.java.repository")
public class EcommerceApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(EcommerceApi.class, args);

	        System.out.println("I am learning Spring Boot:");
	}

}
