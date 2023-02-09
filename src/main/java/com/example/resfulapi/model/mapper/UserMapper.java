package com.example.resfulapi.model.mapper;

import com.example.resfulapi.entity.User;
import com.example.resfulapi.model.dto.UserDTO;

public class UserMapper {
    public static UserDTO toUserDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setAvatar(user.getAvatar());
        userDTO.setPhone(user.getPhone());
        return userDTO;
    }
}
