package com.hknyildz.ToDoApp.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Document
@Setter
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationStrategy.USE_ATTRIBUTES)
    private Long id;

    private String userName;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String role;



//    @
//    @JsonIgnore
    @Field
   private Set<Action> actions=new HashSet<>();
}
