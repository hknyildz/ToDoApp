package com.hknyildz.ToDoApp.daoImpl;

import com.hknyildz.ToDoApp.dao.IUserDao;
import com.hknyildz.ToDoApp.dto.ActionsDto;
import com.hknyildz.ToDoApp.model.Action;
import com.hknyildz.ToDoApp.model.User;
import com.hknyildz.ToDoApp.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserDaoImpl implements IUserDao {

    @Autowired
    IUserRepository repository;

    @Override
    public User findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public List<User> getAll() {
        List<User> list = repository.findAll();
        return list;
    }

    @Override
    public User getByUserId(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public User getByUserName(String userName) {
        return repository.findByUserName(userName);
    }

    @Override
    public List<ActionsDto> getActionsByUserName(String userName) {

        List<ActionsDto> actionsOfUser = repository.getActionsByUserName(userName);
        return actionsOfUser;
    }

//    @Override
//    public List<Action> getActionsOfUser(User user) {
//        List<Action> actionsOfUser = repository.getActionsOfUser(user);
//        return actionsOfUser;
//    }


    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }
}
