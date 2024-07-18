import { useState } from "react"
const App=()=>{
    const [color, setcolor]  = useState("red")
  return(
    <>
        <h1 style={{color:color}}>My color { color}</h1>
        <button onClick={()=>{setcolor("blue")}}>blue</button>
        <button onClick={()=>{setcolor("black")}}>black</button>
        <button onClick={()=>{setcolor("pink")}}>pink</button>
    </>
  )
}
export default App;
