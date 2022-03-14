package com.toDoProject.toDoList.controllers;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

import javax.websocket.server.PathParam;

import com.toDoProject.toDoList.models.Task;
import com.toDoProject.toDoList.services.TaskService;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
//localhost:8080/tasklist
@RequestMapping("/tasklist")
public class TaskController {
    
    @Autowired
    TaskService taskService;

    //Create and save task on database
    @PostMapping("/create")
    public ResponseEntity<Object> saveTask(@RequestBody Task task){
        return ResponseEntity.status(HttpStatus.CREATED).body(taskService.save(task));

    }


    //List all the tasks
    @GetMapping("/all")
    public ResponseEntity<List<Task>> findAllTaks(){
        return ResponseEntity.status(HttpStatus.OK).body(taskService.findAll());
    }


    //List task by ID
    @GetMapping("/finById/{id}")
    public ResponseEntity<Object> FindTasksById(@PathVariable(value = "id") Long id){
        Optional<Task> taskModelOptional = taskService.findById(id); 
        return ResponseEntity.status(HttpStatus.OK).body(taskModelOptional.get());
    }



    // Update task
    @PutMapping("/update/{id}")
    public Optional<Object> updateTasks(@PathVariable(value = "id") Long id, @RequestBody Task task){
        return taskService.findById(id)
            .map(record -> {
                record.setTaskName(task.getTaskName());
                record.setTaskState(task.isTaskState());
                record.setTaskPriority(task.getTaskPriority());
                record.setTaskDescrip(task.getTaskDescrip());
                Task update = (Task) taskService.save(record);
                return  ResponseEntity.status(HttpStatus.OK).body(update);
            });
    }
    

    @DeleteMapping("/del/{id}")
    public ResponseEntity<Object> deleteTask(@PathVariable (value =  "id") Long id){
        Optional<Task> taskModelOptional = taskService.findById(id);
        taskService.delete(taskModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("task deleted successfully!");
        

    }



}
