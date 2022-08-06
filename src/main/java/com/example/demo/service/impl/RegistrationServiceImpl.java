package com.example.demo.service.impl;

import com.example.demo.dto.UserDTO;
import com.example.demo.dto.UserRegistrationDTO;
import com.example.demo.enums.Role;
import com.example.demo.model.User;
import com.example.demo.repository.RegistrationRepository;
import com.example.demo.service.RegistrationService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    private final RegistrationRepository registrationRepository;
    private final PasswordEncoder passwordEncoder;

    public RegistrationServiceImpl(RegistrationRepository registrationRepository, PasswordEncoder passwordEncoder) {
        this.registrationRepository = registrationRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public boolean save(UserRegistrationDTO user) {
        if (!Objects.equals(user.getPassword(), user.getMatchingPassword())) {
            throw new RuntimeException("Password is not equals");
        } else if (registrationRepository.findFirstByName(user.getUsername()).isPresent()) {
            throw new RuntimeException("Username " + user.getUsername() + " already exists");
        } else if (registrationRepository.findFirstByEmail(user.getEmail()).isPresent()) {
            throw new RuntimeException("User with this email already exists");

        }
        User newUSer = User.builder()
                .name(user.getUsername())
                .password(passwordEncoder.encode(user.getPassword()))
                .email(user.getEmail())
                .role(Role.CLIENT)
                .build();
        registrationRepository.save(newUSer);
        return true;
    }

    @Override
    public List<UserDTO> getAll() {
        return null;
    }

    @Override
    public User findByName(String name) {
        return null;
    }
}
