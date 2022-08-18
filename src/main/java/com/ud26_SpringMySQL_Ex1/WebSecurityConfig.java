package com.ud26_SpringMySQL_Ex1;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfiguration{
	
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated()
		.and().formLogin().permitAll().and().httpBasic();
	}
}