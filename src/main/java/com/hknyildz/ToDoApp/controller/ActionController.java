package com.hknyildz.ToDoApp.controller;

import com.hknyildz.ToDoApp.dto.ActionDto;
import com.hknyildz.ToDoApp.model.Action;
import com.hknyildz.ToDoApp.service.IActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/action",produces = "application/json")
public class ActionController {

    @Autowired
    private IActionService actionService;

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public Action create(@RequestBody ActionDto actionDto) {
        return actionService.create(actionDto);
    }

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public List<Action> getAllActions(){
        return actionService.getAllActions();
    }
}
