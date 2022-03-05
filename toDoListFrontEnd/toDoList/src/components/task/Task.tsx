
import "../task/task.scss"
import icon from "../../../public/taskComponent/whiteEditor.svg";

export function Task(){
    return (
        <div className="taskContainer">
            <div className="taskBoxes">
                <input id="teste1" type="checkbox" className="chekClass"/>
                <label htmlFor="teste1"> Testando checkbox</label>
            </div>
            <div className="taskBoxesIcon">
                <button  className="icon"> <img src={icon} alt="editar"/></button>  
                <button  className="icon"> <img src="/taskComponent/whiteGarbage.svg" alt="Garbage" /></button>  
            </div>
        </div>
    )
}


