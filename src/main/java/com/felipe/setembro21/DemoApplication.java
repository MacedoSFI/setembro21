package com.felipe.setembro21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DemoApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedMethods("*")
		.allowedOrigins("*");//aqui acho que devo permitir o frontend da app
		
	}

}

/*
 * opcional caso precise: @EntityScan(basePackages="com.felipe.setembro21") @ComponentScan(basePackages={"com.felipe.setembro21.*"})
opcional caso precise @EnableJpaRepositories(basePackages="com.felipe.setembro21.repository")
 */