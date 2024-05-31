package com.example.JwtExample3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration

public class AppConfig {


	// @Bean
    // public UserDetailsService userDetailsService() {
    //     UserDetails user = User.builder().username("Raj").password(passwordEncoder().encode("abc")).roles("ADMIN").build();
    //     UserDetails user1 = User.builder().username("Ankit").password(passwordEncoder().encode("xyz")).roles("ADMIN").build();
    //     return new InMemoryUserDetailsManager(user,user1);
    // }
	@Bean
	 public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }

  
}
