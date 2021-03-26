package com.swagger.practice.swagger2application.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class ApiConfiguration {    
	
    @Bean
    public Docket docket(ApiInfo apiInfo) { 
        return new Docket(DocumentationType.SWAGGER_2)
          .groupName("contact-api")
          .useDefaultResponseMessages(false)
          .apiInfo(apiInfo())
          .select().paths(regex("/api/.*"))                         
          .build();                                           
    }
    
    @Bean
    public ApiInfo apiInfo() {
    	return new ApiInfoBuilder()
    			.title("Address Book")
    			.description("API for fetching contact related information")
    			.version("1.0.0")
    			.build();
    }
    
    @Bean
    public UiConfiguration uiConfiguration() {
    	return UiConfigurationBuilder.builder()
    			.deepLinking(true)
    			.validatorUrl(null)
    			.build();
    }
}
