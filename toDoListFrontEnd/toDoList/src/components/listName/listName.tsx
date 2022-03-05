import "../listName/listName.scss";

export function ListName (){
   
    return (
        <div className="ListNameContainer">
            <input type="text" placeholder="Name of List" className="ListName title"/>
            <br/>
            <textarea  placeholder="Notes..." className="ListName desc"></textarea>
            <hr className="divider"/>
        </div>
    )
    
}


