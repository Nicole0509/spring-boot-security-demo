package org.example.springbootsecurity.Services;

import org.example.springbootsecurity.Models.Users;
import org.example.springbootsecurity.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12); //using 2^12 rounds of hashing

    public Users register (Users user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepo.save(user);
    }
}
