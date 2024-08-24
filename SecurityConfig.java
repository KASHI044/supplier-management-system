package com.makersharks.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Disable CSRF for simplicity
            .authorizeRequests()
                .requestMatchers("/openapi/").permitAll()  // Open endpoint
                .requestMatchers("/api/public/**").permitAll()  // Public API
                .requestMatchers("/api/admin/**").hasRole("ADMIN")  // Admin protected
                .anyRequest().authenticated()  // All other endpoints need authentication
            .and()
            .httpBasic();  // Use HTTP Basic Authentication for simplicity

        return http.build();
    }
}
