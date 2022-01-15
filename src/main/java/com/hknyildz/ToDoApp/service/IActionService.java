package com.hknyildz.ToDoApp.service;

import com.hknyildz.ToDoApp.dto.ActionDto;
import com.hknyildz.ToDoApp.model.Action;
import com.hknyildz.ToDoApp.model.User;

import java.util.List;

public interface IActionService {

    Action create(ActionDto actionDto);

    List<Action> getAllActions();
}
