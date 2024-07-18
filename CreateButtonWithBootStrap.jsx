import { useState } from "react"
import Button from "react-bootstrap/Button"
const App=()=>{
    const [color, setcolor]  = useState("red")
  return(
    <>
        <h1 style={{color:color}}>My color { color}</h1>
        <Button type="button" class="btn btn-danger" onClick={()=>{setcolor("blue")}}>Danger</Button>
        <Button type="button" class="btn btn-danger" onClick={()=>{setcolor("pink")}}>Danger</Button>
        <Button type="button" class="btn btn-danger" onClick={()=>{setcolor("black")}}>Danger</Button>
        <button >black</button>
        <button >pink</button>
    </>
  )
}
export default App;
