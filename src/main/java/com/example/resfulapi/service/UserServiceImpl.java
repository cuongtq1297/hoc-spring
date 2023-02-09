package com.example.resfulapi.service;

import com.example.resfulapi.entity.User;
import com.example.resfulapi.exception.NotFoundException;
import com.example.resfulapi.model.dto.UserDTO;
import com.example.resfulapi.model.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService{
    private static ArrayList<User> users = new ArrayList<User>();
    static {
        users.add(new User(1, "cuong","cuong@.com","56789","avatar.img","123456"));
        users.add(new User(2, "cuong","cuong@.com","56789","avatar.img","123456"));
        users.add(new User(3, "cuong","cuong@.com","56789","avatar.img","123456"));
        users.add(new User(4, "cuong","cuong@.com","56789","avatar.img","123456"));
    }

    @Override
    public List<UserDTO> getListUser() {
        List<UserDTO> result = new ArrayList<UserDTO>();
        for(User user : users){
            result.add(UserMapper.toUserDTO(user));
        }
        return result;
    }

    @Override
    public UserDTO getUserById(int id) {
        for(User user : users){
            if(user.getId() == id){
                return UserMapper.toUserDTO(user);
            }
        }
        throw new NotFoundException("Khong tim thay user");
    }

    @Override
    public List<UserDTO> searchUsers(String keyword) {
        List<UserDTO> result = new ArrayList<>();
        for(User user: users){
            if(user.getName().contains(keyword)){
                result.add(UserMapper.toUserDTO(user));
            }
        }
        return result;
    }
}
