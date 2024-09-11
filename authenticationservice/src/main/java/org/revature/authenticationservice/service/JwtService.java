package org.revature.authenticationservice.service;

import org.revature.authenticationservice.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    public String generateToken(UserDetails userDetails) {
        return jwtTokenUtil.generateToken(userDetails);
    }

    public Boolean validateToken(String token, UserDetails userDetails) {
        return jwtTokenUtil.validateToken(token, userDetails);
    }

    public String extractUsernameFromToken(String token) {
        return jwtTokenUtil.getUsernameFromToken(token);
    }
}