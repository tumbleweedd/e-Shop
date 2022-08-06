package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.dto.UserRegistrationDTO;
import com.example.demo.model.User;

import java.util.List;

public interface RegistrationService {
    boolean save(UserRegistrationDTO user);

    List<UserDTO> getAll();

    User findByName(String name);

}
