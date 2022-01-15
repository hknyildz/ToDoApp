package com.hknyildz.ToDoApp.serviceImpls;

import com.hknyildz.ToDoApp.dao.IUserDao;
import com.hknyildz.ToDoApp.dto.UserDto;
import com.hknyildz.ToDoApp.model.User;
import com.hknyildz.ToDoApp.model.role;
import com.hknyildz.ToDoApp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public User createUser(UserDto userDto) throws Exception {
        User user = new User();
        if (userDao.findByEmail(userDto.getEmail()) == null) {
            user.setId(userDto.getId());
            user.setUserName(userDto.getUserName());
            user.setFirstName(userDto.getFirstName());
            user.setLastName(userDto.getLastName());
            user.setEmail(userDto.getEmail());
            user.setRole(role.USER.toString());
            user.setPassword(userDto.getPassword());

            String password = userDto.getPassword();

//            user.setPassword(new BCryptPasswordEncoder().encode(password));
        } else {
            throw new Exception("This email is already exist");
        }

        return userDao.createUser(user);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}
