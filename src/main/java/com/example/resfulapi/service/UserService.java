package com.example.resfulapi.service;

import com.example.resfulapi.model.dto.UserDTO;

import java.util.List;

public interface UserService {
    public List<UserDTO> getListUser();
    public UserDTO getUserById(int id);
    public List<UserDTO> searchUsers(String name);
}
