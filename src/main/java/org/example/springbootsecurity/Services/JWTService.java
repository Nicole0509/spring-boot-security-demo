package org.example.springbootsecurity.Services;

import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

@Service
public class JWTService {
    public String generateToken() {
        return "token generated";
    }
}
