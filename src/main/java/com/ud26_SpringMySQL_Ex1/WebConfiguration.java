package com.ud26_SpringMySQL_Ex1;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Configuration;

public class WebConfiguration implements WebMvcConfigurer {
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("*").allowedOrigins("*").allowedMethods("*");
	}
}