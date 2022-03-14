import "../../pages/home/home.scss";
import { Button } from "../../components/addTask/button/Button";
import { Input } from "../../components/addTask/input/Input";
import { ListName } from "../../components/listName/listName";
import { Task } from "../../components/task/Task";
import {FormEvent, useEffect, useState} from "react";

// Add task
// Edit task (Update)
// remove task
// Complete task

export function Home (){

    //fazer uma função para armazenar o valor do input ele executa a função e guarda o valor no useState
    const [tasks, setTasks] = useState<Array<string>>([]);
    const [toDo, setToDo] = useState<string>("");

    useEffect(()=>{
        console.log(tasks, toDo)
    },[tasks])
    

    function AddToDo (event:FormEvent){
        // Não deixa que a página seja carregada
        event.preventDefault()
        setTasks([...tasks, toDo])
    }

    return (
        <div className="bodyTask">
        
            <div className="divListName">
                <ListName/>
            </div>
            
            <div className="addTaskCamp">
                <form onSubmit={AddToDo}>
                    <Input value={toDo} onChangeValue={setToDo}/>
                    <Button/>
                </form>
                
            </div>
            
            <div className="tasksList">
               {
                   tasks.map(item => <Task title={item} /> )
               }
               
               
            </div>
            
            <div className="completedTasks">
                
            </div>

            <div className="themes">
                    
            </div>

        </div>
    )
}