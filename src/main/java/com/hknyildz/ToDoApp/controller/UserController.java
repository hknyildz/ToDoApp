package com.hknyildz.ToDoApp.controller;

import com.hknyildz.ToDoApp.dto.UserDto;
import com.hknyildz.ToDoApp.model.User;
import com.hknyildz.ToDoApp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user",produces = "application/json")
public class UserController {

    @Autowired
    private IUserService userService;



    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String saveUser(@RequestBody UserDto userDto) throws Exception {

        userService.createUser(userDto);
        return "User saved succesfully";
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<User> list() {
        return userService.getAll();
    }

}
