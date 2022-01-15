package com.hknyildz.ToDoApp.serviceImpls;

import com.hknyildz.ToDoApp.dao.IActionDao;
import com.hknyildz.ToDoApp.dao.IUserDao;
import com.hknyildz.ToDoApp.dto.ActionDto;
import com.hknyildz.ToDoApp.model.Action;
import com.hknyildz.ToDoApp.model.User;
import com.hknyildz.ToDoApp.service.IActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        action.setAction(false);
        User currentUser = new User();
        currentUser=userDao.getByUserId(action.getId());
        action.setUser(currentUser);
        return actionDao.createAction(action);
    }

    @Override
    public List<Action> getAllActions() {
        return actionDao.getAllActions();
    }
}
