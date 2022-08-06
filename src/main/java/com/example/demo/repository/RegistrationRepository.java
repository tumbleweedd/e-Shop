package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegistrationRepository extends JpaRepository<User, Long> {
    Optional<User> findFirstByName(String name);
    Optional<User> findFirstByEmail(String email);

}
