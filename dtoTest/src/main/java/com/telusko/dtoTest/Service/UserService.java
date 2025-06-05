package com.telusko.dtoTest.Service;

import DTO.UserDTO;
import com.telusko.dtoTest.Repository.UserRepository;
import com.telusko.dtoTest.model.User;
import convert.UserDTOConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private UserDTOConverter userDTOConverter;

    public List<UserDTO> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(userDTOConverter::convertToDTO)
                .collect(Collectors.toList());
    }

    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(Math.toIntExact(id)).orElseThrow(() -> new RuntimeException("User not found"));
        return userDTOConverter.convertToDTO(user);
    }

    public UserDTO createUser(UserDTO userDTO) {
        User user = userDTOConverter.convertToEntity(userDTO);
        User savedUser = userRepository.save(user);
        return userDTOConverter.convertToDTO(savedUser);
    }

    public UserDTO updateUser(Long id, UserDTO userDTO) {
        User user = userRepository.findById(Math.toIntExact(id)).orElseThrow(() -> new RuntimeException("User not found"));
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        User updatedUser = userRepository.save(user);
        return userDTOConverter.convertToDTO(updatedUser);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(Math.toIntExact(id));
    }
}
