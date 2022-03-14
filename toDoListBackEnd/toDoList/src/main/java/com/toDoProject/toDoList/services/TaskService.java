package com.toDoProject.toDoList.services;

import java.util.List;

import com.toDoProject.toDoList.models.Task;
import com.toDoProject.toDoList.repositories.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    

    @Autowired
    TaskRepository taskRepository;

    //Define o estado da tarefa (concluido ou não concluido)
    public boolean checked (boolean state){
        if (state == true){
            System.out.println("Tarefa concluida");
            
        }else {
            System.out.println("Falta concluir a tarefa");
        }
        return state;
    }

    //Define a prioridade da tarefa
    public int priority (int flag){
        
        switch(flag){

            case(1):{
                System.out.print("Alta prioridade");
                    break;
            }

            case(2):{
                System.out.println("Média prioridade");
                    break;
            }

            case(3):{
                System.out.println("Baixa prioridade");
                    break;
            }
        }
        
        return flag;
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }





}
