import "../../pages/home/home.scss";
import { Button } from "../../components/addTask/button/Button";
import { Input } from "../../components/addTask/input/Input";
import { ListName } from "../../components/listName/listName";
import { Task } from "../../components/task/Task";

export function Home (){
    return (
        <div className="bodyTask">
        
            <div className="divListName">
                <ListName/>
            </div>
            
            <div className="addTaskCamp">
                <Input/>
                <Button/>
            </div>
            
            <div className="tasksList">
                <Task/>
            </div>
            
            <div className="completedTasks">
                
            </div>

            <div className="themes">
                    
            </div>

        </div>
    )
}