import { useState } from "react";
import Button from "react-bootstrap/Button"
const App=()=>{
  const [num, setnum] = useState(0)
  const mydec=()=>{
      if(num<=0){
        alert("not decrese more")
      }
      else{
        setnum(num-1)
      }
  }
     return(
      <>
         <h1>number is {num}</h1>
         <Button type="button" className="btn btn-secondary" onClick={mydec}>Decrement</Button>
         <Button type="button" className="btn btn-secondary" onClick={()=>{setnum(num+1)}}>Increment</Button>
         <Button type="button" className="btn btn-secondary" onClick={()=>{setnum(0)}}>Reset</Button>
      </>
     )
}
export default App;
