// package com.kukertone.kukertone_be.config;
//
// import lombok.RequiredArgsConstructor;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.web.cors.CorsConfiguration;
// import org.springframework.web.cors.CorsConfigurationSource;
// import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
// import java.util.Arrays;
//
// @Configuration
// @EnableWebSecurity
// @RequiredArgsConstructor
// public class CorsConfig {
//     @Bean
//     public CorsConfigurationSource corsConfigurationSource() {
//         UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//         source.registerCorsConfiguration("/**", getDefaultCorsConfiguration());
//         return source;
//     }
//
//     public CorsConfiguration getDefaultCorsConfiguration() {
//         CorsConfiguration configuration = new CorsConfiguration();
//         configuration.setAllowedOriginPatterns(Arrays.asList("*"));
//         configuration.setAllowedHeaders(Arrays.asList("*"));
//         configuration.setAllowedMethods(Arrays.asList("*"));
//         configuration.setAllowCredentials(true);
//         configuration.setMaxAge(3600L);
//         return configuration;
//     }
// }
