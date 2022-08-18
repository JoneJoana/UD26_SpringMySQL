package com.ud26_SpringMySQL_Ex1;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig implements WebMvcConfigurer  {

    protected void configure(HttpSecurity http) throws Exception {
        http
        .authorizeRequests()
        .antMatchers("/**").authenticated()
        //.antMatchers(HttpMethod.GET,"/**").authenticated()
        //.antMatchers(HttpMethod.POST,"/**").authenticated()
        //.antMatchers(HttpMethod.PUT, "/**").authenticated()
        //.antMatchers(HttpMethod.DELETE,"/**").hasRole("admin")
        .antMatchers("/").permitAll()
        .and().formLogin().permitAll()
        .and().httpBasic();
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
    	registry.addMapping("*").allowedOrigins("*").allowedMethods("*");
    }

}