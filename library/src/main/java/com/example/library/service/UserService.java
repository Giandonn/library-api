package com.example.library.service;

import com.example.library.dto.UserDTO;
import com.example.library.model.User;
import com.example.library.repository.UserRepository;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public UserDTO create(UserDTO userData) {
        User user = new User();
        user.setName(userData.getName());
        User saved = userRepository.save(user);

        return new UserDTO(saved.getName());
    }

    public void delete (Long id) {
        if (!userRepository.existsById(id)) {
            throw new IllegalArgumentException("Id não encontrado. Verifique!");
        }

        userRepository.deleteById(id);
    }
}
