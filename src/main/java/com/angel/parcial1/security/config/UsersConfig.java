package com.angel.parcial1.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UsersConfig {

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails usuario = User.withDefaultPasswordEncoder()
                .username("arenteria")
                .password("123456789")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(usuario);
    }
}
