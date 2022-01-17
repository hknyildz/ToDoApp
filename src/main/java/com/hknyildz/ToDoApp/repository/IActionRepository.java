package com.hknyildz.ToDoApp.repository;

import com.hknyildz.ToDoApp.model.Action;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IActionRepository extends CouchbaseRepository<Action, Long> {

}
