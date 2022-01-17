package com.hknyildz.ToDoApp.dto;

import com.hknyildz.ToDoApp.model.enums.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActionsDto {

    private Long id;
    private String title;
    private Status status;
}
