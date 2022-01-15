package com.hknyildz.ToDoApp.dao;

import com.hknyildz.ToDoApp.model.Action;

import java.util.List;

public interface IActionDao {


    List<Action> getAllList();

    Action createAction(Action action);

    int removeById(Long id);

    List<Action> getAllActions();


}
