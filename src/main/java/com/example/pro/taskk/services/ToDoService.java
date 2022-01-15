package com.example.pro.taskk.services;

import com.example.pro.taskk.entities.ToDoList;

import java.util.List;

public interface ToDoService {
    List<ToDoList> getAllThings();
    ToDoList getOneThing(Long id);
    ToDoList addThing(ToDoList list);
    ToDoList updateThing(ToDoList list);
    void deleteThing(ToDoList list);
}
