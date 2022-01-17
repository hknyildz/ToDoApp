package com.hknyildz.ToDoApp.dao;

import com.hknyildz.ToDoApp.dto.ActionsDto;
import com.hknyildz.ToDoApp.model.Action;
import com.hknyildz.ToDoApp.model.User;

import java.util.List;

public interface IUserDao {

User saveUser(User user);

User findByEmail(String email);

    List<User> getAll();

    User getByUserId(Long id);

    User getByUserName(String userName);

   List<ActionsDto> getActionsByUserName(String userName);

//   List<Action> getActionsOfUser(User user);



}
