package com.example.pro.taskk.repositories;

import com.example.pro.taskk.entities.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ToDoRepository extends JpaRepository<ToDoList, Long> {
    List<ToDoList> findAllByOrderByPriorityDesc();
}
