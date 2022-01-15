package com.hknyildz.ToDoApp.service;

import com.hknyildz.ToDoApp.dto.UserDto;
import com.hknyildz.ToDoApp.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IUserService {

    User createUser(UserDto userDto) throws Exception;

    List<User> getAll();

}
