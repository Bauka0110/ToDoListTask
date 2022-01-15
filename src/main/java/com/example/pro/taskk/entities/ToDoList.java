package com.example.pro.taskk.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "lists")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDoList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "date")
    private Date date = new Date();

    @Column(name = "priority")
    private boolean priority;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "done")
    private boolean done = false;

}
