package com.in28minutes.rest.webservices.restfulwebservices.Authentication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

//@Configuration
public class AuthenticationSecurityConfiguration 
{
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
	{
		return http.authorizeHttpRequests( auth -> auth.antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
				.anyRequest().authenticated())
		.httpBasic(Customizer.withDefaults())
		.oauth2Login(Customizer.withDefaults())
		.sessionManagement( session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
		.csrf().disable()
		.build();
	}
}
