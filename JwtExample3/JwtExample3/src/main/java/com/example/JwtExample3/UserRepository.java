package com.example.JwtExample3;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, String> {


    public Optional<User> findByEmail(String email);

  
}
