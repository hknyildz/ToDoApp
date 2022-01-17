package com.hknyildz.ToDoApp.repository;

import com.hknyildz.ToDoApp.dto.ActionsDto;
import com.hknyildz.ToDoApp.model.Action;
import com.hknyildz.ToDoApp.model.User;
import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUserRepository extends CouchbaseRepository<User,Long> {

//    @Query("SELECT actions FROM #{#n1ql.bucket} WHERE userName = $1 AND #{#n1ql.filter}")
    List<Action> getActionsByUserId(Long userId);

//    List<Action> getActionsOfUser(User user);

    User findByEmail(String email);

    User findByUserName(String userName);





}
