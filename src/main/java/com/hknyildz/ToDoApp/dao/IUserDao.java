package com.hknyildz.ToDoApp.dao;

import com.hknyildz.ToDoApp.model.User;

import java.util.List;

public interface IUserDao {

User createUser(User user);

User findByEmail(String email);

    List<User> getAll();

    User getByUserId(Long id);
}
