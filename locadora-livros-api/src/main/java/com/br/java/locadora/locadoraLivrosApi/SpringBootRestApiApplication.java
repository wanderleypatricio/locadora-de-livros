package com.br.java.locadora.locadoraLivrosApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EntityScan(basePackages = {"com.br.java.locadora.locadoraLivrosApi.Entity"})
@ComponentScan(basePackages = {"com.br.java.*"})
@EnableJpaRepositories(basePackages = {"com.br.java.locadora.locadoraLivrosApi.repository"})
@EnableTransactionManagement
@EnableWebMvc
@RestController
@EnableAutoConfiguration
public class SpringBootRestApiApplication implements WebMvcConfigurer{

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestApiApplication.class, args);
    }
    

	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedMethods("*").allowedOrigins("*");
	}
}
