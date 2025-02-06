package com.angel.parcial1.security.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SeguridadConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        // Permitir acceso sin autenticación
                        .requestMatchers("/publico", "/login").permitAll()
                        // Proteger todas las demás rutas
                        .anyRequest().authenticated()
                )
                .formLogin(login -> login
                        // Ruta personalizada del formulario de login
                        .loginPage("/login")
                        // Redirigir a /privado después del login
                        .defaultSuccessUrl("/privado", true)
                        .permitAll()
                )
                .httpBasic(withDefaults());

        return http.build();
    }
}
