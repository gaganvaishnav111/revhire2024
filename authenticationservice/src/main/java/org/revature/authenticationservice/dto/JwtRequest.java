package org.revature.authenticationservice.dto;

import lombok.Data;

@Data
public class JwtRequest {
    private String username;
    private String password;

}
