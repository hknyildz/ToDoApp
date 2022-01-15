package com.hknyildz.ToDoApp.daoImpl;

import com.hknyildz.ToDoApp.dao.IUserDao;
import com.hknyildz.ToDoApp.model.User;
import com.hknyildz.ToDoApp.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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
        List<User> list = (List<User>) repository.findAll();
        return list;
    }

    @Override
    public User getByUserId(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public User createUser(User user) {
        return repository.save(user);
    }
}
