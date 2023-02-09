package com.example.resfulapi.controller;

import com.example.resfulapi.entity.User;
import com.example.resfulapi.model.dto.UserDTO;
import com.example.resfulapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/users")
public class MyController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<?> getListUser() {
        List<UserDTO> users = userService.getListUser();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id) {
        UserDTO userDTO = userService.getUserById(id);
        return ResponseEntity.ok(userDTO);
    }

    @GetMapping("/users/search")
    public ResponseEntity<?> searchUser(@RequestParam(name = "keyword", required = false, defaultValue = "") String name) {
        List<UserDTO> users = userService.searchUsers(name);
        return ResponseEntity.ok(users);
    }

    @PostMapping("/users")
    public ResponseEntity<?> createUser() {
        return null;
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateUser() {
        return null;
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<?> deleteUser() {
        return null;
    }
}
