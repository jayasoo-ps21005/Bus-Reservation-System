package com.Transpo.transpo.controller;

import com.Transpo.transpo.dto.UserDTO;
import com.Transpo.transpo.exception.BadRequestException;
import com.Transpo.transpo.exception.ConflictException;
import com.Transpo.transpo.exception.NotFoundException;
import com.Transpo.transpo.mapper.UserMapper;
import com.Transpo.transpo.model.Role;
import com.Transpo.transpo.model.User;
import com.Transpo.transpo.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {

    private final UserRepository userRepository;

    public AuthController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // ================= REGISTER =================
    @PostMapping("/register")
    public UserDTO register(@RequestBody User user) {

        if (user.getEmail() == null || user.getPassword() == null) {
            throw new BadRequestException("Email and password are required");
        }

        // Check duplicate email
        if (userRepository.findByUsername(user.getEmail()).isPresent()) {
            throw new ConflictException("Email already registered");
        }

        // Default role = PASSENGER
        user.setRole(Role.PASSENGER);

        User savedUser = userRepository.save(user);
        return UserMapper.toDTO(savedUser);
    }

    // ================= LOGIN =================
    @PostMapping("/login")
    public UserDTO login(@RequestBody User loginRequest) {

        User user = userRepository.findByUsername(loginRequest.getEmail())
                .orElseThrow(() -> new NotFoundException("Invalid email or password"));

        if (!user.getPassword().equals(loginRequest.getPassword())) {
            throw new BadRequestException("Invalid email or password");
        }

        return UserMapper.toDTO(user);
    }
}
