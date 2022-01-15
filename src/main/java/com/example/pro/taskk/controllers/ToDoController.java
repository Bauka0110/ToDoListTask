package com.example.pro.taskk.controllers;

import com.example.pro.taskk.entities.ToDoList;
import com.example.pro.taskk.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "http://localhost:3000/")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping(value = "/toDoList")
    public ResponseEntity<List<ToDoList>> getToDoList() {
        List<ToDoList> things = toDoService.getAllThings();
        return new ResponseEntity<>(things, HttpStatus.OK);
    }

    @GetMapping(value = "/getOneThing/{id}")
    public ResponseEntity<ToDoList> getOneThing(@PathVariable(name = "id") Long id){
        ToDoList thing = toDoService.getOneThing(id);
        return ResponseEntity.ok(thing);
    }

    @PostMapping(value = "/addThing")
    public ResponseEntity<ToDoList> add(@RequestBody ToDoList thing) {
        thing = toDoService.addThing(thing);
        return new ResponseEntity<>(thing, HttpStatus.OK);
    }

    @PutMapping(value = "/updateThing")
    public ResponseEntity<ToDoList> update(@RequestBody ToDoList thing) {
        thing = toDoService.updateThing(thing);
        return new ResponseEntity<>(thing, HttpStatus.OK);
    }

    @DeleteMapping(value = "/deleteThing")
    public ResponseEntity<String> delete(@RequestBody ToDoList thing) {
        toDoService.deleteThing(thing);
        return new ResponseEntity<>("DELETED", HttpStatus.OK);
    }

}
