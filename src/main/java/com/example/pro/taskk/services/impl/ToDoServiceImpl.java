package com.example.pro.taskk.services.impl;

import com.example.pro.taskk.entities.ToDoList;
import com.example.pro.taskk.repositories.ToDoRepository;
import com.example.pro.taskk.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    @Override
    public List<ToDoList> getAllThings() {
        return toDoRepository.findAllByOrderByPriorityDesc();
    }

    @Override
    public ToDoList getOneThing(Long id) {
        return toDoRepository.findById(id).orElse(null);
    }

    @Override
    public ToDoList addThing(ToDoList thing) {
        return toDoRepository.save(thing);
    }

    @Override
    public ToDoList updateThing(ToDoList thing) {
        return toDoRepository.save(thing);
    }

    @Override
    public void deleteThing(ToDoList thing) {
        toDoRepository.delete(thing);
    }
}
