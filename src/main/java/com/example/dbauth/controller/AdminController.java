package com.example.dbauth.controller;

import com.example.dbauth.model.User;
import com.example.dbauth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class AdminController {   //add user data to the database
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add/admin")
    public String addUser(@RequestBody User user){
      String pwd=user.getPassword();
      String encryptedPwd=passwordEncoder.encode(pwd);
      user.setPassword(encryptedPwd);
      userRepository.save(user);
      return "User has been added";
  }
}
