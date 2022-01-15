package com.hknyildz.ToDoApp.repository;

import com.hknyildz.ToDoApp.model.User;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends CouchbaseRepository<User,Long> {

    User findByEmail(String email);



}
