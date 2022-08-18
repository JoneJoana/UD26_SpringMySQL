package com.ud26_SpringMySQL_Ex1;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig{
	
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
        .authorizeRequests()
        .antMatchers(HttpMethod.GET,"/api/piezas").authenticated()
        .antMatchers(HttpMethod.GET,"/api/piezas/**").authenticated()
        .antMatchers(HttpMethod.POST,"/api/piezas").authenticated()
        .antMatchers(HttpMethod.PUT,"/api/piezas/**").authenticated()
        .antMatchers(HttpMethod.DELETE,"/api/piezas/**").hasRole("admin")
        .anyRequest().authenticated()
        .and().formLogin().permitAll()
        .and().httpBasic();
	}
}