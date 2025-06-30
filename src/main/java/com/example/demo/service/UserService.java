package com.example.demo.service;

import com.example.demo.dto.RegisterRequest;
import com.example.demo.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> findByUsername(String username);
    List<User> getAllUsers();
    User createUser(User user);
    void softDelete(Long id);
    void register(RegisterRequest request);
    User updateUser(Long id, User user);
    User getUserById(Long id);

}
