package com.swagger.practice.swagger2application.configuration;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class ApiConfiguration {

	 @Bean
	  public GroupedOpenApi contactApi() {
	      return GroupedOpenApi.builder()
	              .group("demo-contacts")
	              .pathsToMatch("/api-contacts/**")
	              .build();
	  }
	 
	 @Bean
	  public GroupedOpenApi tutorialsApi() {
	      return GroupedOpenApi.builder()
	              .group("demo-tutorials")
	              .pathsToMatch("/api-tutorials/**")
	              .build();
	  }

	 @Bean
	  public OpenAPI springShopOpenAPI() {
	      return new OpenAPI()
	              .info(new Info().title("SpringShop API")
	              .description("Spring shop sample application")
	              .version("v0.0.1")
	              .license(new License().name("Apache 2.0").url("http://springdoc.org")))
	              .externalDocs(new ExternalDocumentation()
	              .description("SpringShop Wiki Documentation")
	              .url("https://springshop.wiki.github.org/docs"));
	  }

}
