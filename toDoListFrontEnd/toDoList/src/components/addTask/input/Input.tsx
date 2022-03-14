interface IInput {
    value : string, 
    onChangeValue : React.Dispatch<React.SetStateAction<string>>
}

export function Input({value, onChangeValue} : IInput ){
    return (
        <div>
            <input value={value} onChange={(event)=> {
                onChangeValue(event.target.value);
            }} type="text" placeholder="Adicione uma tarefa" className="addTaskStyleInput"></input>
        </div>
    ) 
}