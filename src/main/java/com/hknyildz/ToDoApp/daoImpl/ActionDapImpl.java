package com.hknyildz.ToDoApp.daoImpl;

import com.hknyildz.ToDoApp.dao.IActionDao;
import com.hknyildz.ToDoApp.model.Action;
import com.hknyildz.ToDoApp.repository.IActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ActionDapImpl implements IActionDao {

    @Autowired
    private IActionRepository repository;

    @Override
    public List<Action> getAllList() {
        List<Action> list = repository.findAll();
        return list;
    }

    @Override
    public Action createAction(Action action) {
        return repository.save(action);
    }

    @Override
    public int removeById(Long id) {
        repository.deleteById(id);
        return 1;
    }

    @Override
    public List<Action> getAllActions() {
        return repository.findAll();
    }
}
