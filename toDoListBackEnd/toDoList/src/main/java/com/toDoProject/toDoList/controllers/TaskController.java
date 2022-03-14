package com.toDoProject.toDoList.controllers;

import java.util.List;

import com.toDoProject.toDoList.models.Task;
import com.toDoProject.toDoList.services.TaskService;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@RequestMapping("/tasklist")
public class TaskController {
    
    @Autowired
    TaskService taskService;

    //List all the tasks
    @GetMapping
    public ResponseEntity<List<Task>> findAllTaks(){
        return ResponseEntity.status(HttpStatus.OK).body(taskService.findAll());
    }


    
    // @GetMapping("/{id}")
    // public ResponseEntity<Object> FindTasksById(){
    //     return
    // }


    // @PostMapping
    

    // @PutMapping
    // @DeleteMapping


}
