package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
//@ComponentScan(basePackages = "com.cg.boot")
@EnableSwagger2
@EnableJpaRepositories
@EnableEurekaClient
public class AdminModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminModuleApplication.class, args);
		
		//System.err.println("started 8788");
	}
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors
						.basePackage("com.cg"))
				.build();
	}
	 @Configuration
	    class RestTemplateConfig {
	            
	            @Bean
	            //@LoadBalanced
	            public RestTemplate restTemplate() {
	              return new RestTemplate();
	            }
	    }
}

