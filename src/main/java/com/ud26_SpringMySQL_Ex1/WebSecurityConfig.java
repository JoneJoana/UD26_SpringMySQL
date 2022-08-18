package com.ud26_SpringMySQL_Ex1;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    protected void configure(HttpSecurity http) throws Exception {
        http
        .authorizeRequests()
        .antMatchers(HttpMethod.GET,"/**").hasRole("admin")
        .antMatchers(HttpMethod.POST,"/**").hasRole("admin")
        .antMatchers(HttpMethod.PUT, "/**").hasRole("admin")
        .antMatchers(HttpMethod.DELETE,"/**").hasRole("admin")
        .antMatchers("/").permitAll()
        .and().formLogin()
        .and().httpBasic();
    }

}