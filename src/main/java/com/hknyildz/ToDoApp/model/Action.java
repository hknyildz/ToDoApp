package com.hknyildz.ToDoApp.model;

import com.couchbase.client.java.search.queries.BooleanFieldQuery;
import com.hknyildz.ToDoApp.model.enums.Status;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

@Document
@Getter
@Setter

public class Action {

    @Id
    @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
    private Long id;

    private String title;

    private Status status;

    private Long userId;
//    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})


}
