package com.hknyildz.ToDoApp.serviceImpls;

import com.hknyildz.ToDoApp.dao.IActionDao;
import com.hknyildz.ToDoApp.dao.IUserDao;
import com.hknyildz.ToDoApp.dto.ActionDto;
import com.hknyildz.ToDoApp.model.Action;
import com.hknyildz.ToDoApp.model.User;
import com.hknyildz.ToDoApp.model.enums.Status;
import com.hknyildz.ToDoApp.repository.IUserRepository;
import com.hknyildz.ToDoApp.service.IActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActionServiceImpl implements IActionService {

    @Autowired
    private IActionDao actionDao;

    @Autowired
    private IUserDao userDao;



    @Override
    public Action create(ActionDto actionDto) {
        Action action = new Action();
        action.setId(actionDto.getId());
        action.setTitle(actionDto.getTitle());
        action.setStatus(Status.DO);
        User currentUser = new User();
        currentUser = userDao.getByUserId(actionDto.getUserId());
        action.setUserId(actionDto.getUserId());
        List<Action> actions;
        actions = currentUser.getActions();
        actions.add(action);
        currentUser.setActions(actions);
        userDao.saveUser(currentUser);
        return actionDao.createAction(action);
    }

    @Override
    public List<Action> getAllActions() {
        return actionDao.getAllActions();
    }
}
