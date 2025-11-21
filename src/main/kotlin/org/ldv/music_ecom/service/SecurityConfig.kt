package org.ldv.music_ecom.service

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableMethodSecurity
class SecurityConfig {
    @Bean
    fun passwordEncoder(): PasswordEncoder = BCryptPasswordEncoder()

    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        http.authorizeHttpRequests {
            
            it.requestMatchers("/music_ecom", "/music_ecom/register", "/music_ecom/login", "/css/**", "/js/**", "/img/**", "/favicon.ico").permitAll()


                // Autoriser l'accès pour les utilisateurs avec le rôle "ADMIN" à /admin/**
                .requestMatchers("/music_ecom/admin/**").hasRole("ADMIN")
                // Autoriser l'accès pour les utilisateurs avec le rôle "CLIENT" à /client/**
                .requestMatchers("/music_ecom/user/**").hasRole("CLIENT")
                // Toutes les autres requêtes doivent être authentifiées
                .anyRequest().authenticated()

        }
            // Configuration du formulaire de connexion
            .formLogin { form: FormLoginConfigurer<HttpSecurity?> ->
                form
                    .loginPage("/music_ecom/login").defaultSuccessUrl("/music_ecom/profile").failureUrl("/music_ecom/login?error=true")
                    .permitAll()
            }

            // Configuration du mécanisme de déconnexion
            .logout { logout: LogoutConfigurer<HttpSecurity?> ->
                logout
                    .logoutUrl("/music_ecom/logout")
                    .permitAll()
            }

        return http.build()
    }
    @Bean
    fun authenticationManager(config: AuthenticationConfiguration): AuthenticationManager {
        return config.authenticationManager

}




        }
