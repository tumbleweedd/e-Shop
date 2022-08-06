package com.example.demo.dto;

import com.example.demo.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private String username;
    private String password;
    private String matchingPassword;
    private String email;
    private Role role;




//    public UserDTO(User user) {
//        this.username = user.getName();
//        this.password = user.getPassword();
//        this.matchingPassword = user.getPassword();
//        this.email = getEmail();
//    }
}
