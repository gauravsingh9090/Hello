const App=()=>{
    return(
        <>
        <div style={{backgroundColor:"red" ,height:"600px",padding:"80px", border:"10px"}}>
            <div style={{backgroundColor:"pink" ,height:"400px",padding:"80px", border:"10px",borderColor:"black"}}>
                <div style={{backgroundColor:"green" ,height:"200px",padding:"60px",alignItems:"center", fontSize:"50px", }}><h1 style={{marginLeft:"300px"}}>Cybrom</h1></div>
            </div>
        </div>
        </>
    )
}

export default App;
*/

/*
import { useState } from "react";

const App=()=>{
    const [color,setcolor] = useState("red");

    return(
        <>
         <h1 style={{backgroundColor:color}}>THis Program a change a Color </h1>
         <button onClick={()=>{setcolor("blue")}}>BLue</button>
         <button onClick={()=>{setcolor("pink")}}>pink</button>
         <button onClick={()=>{setcolor("yellow")}}>Yellow</button>
         <button onClick={()=>{setcolor("orange")}}>Orange</button>
        </>
    )
}
export default App;
*/


/*
import { useState } from "react";

const App=()=>{
   const [name, setname] = useState("AMan")
   const  change=()=>{
       setname("Gaurav")
   }
   return(
    <>
    <h1>My name is {name}</h1>
    <button onClick={change}>Change name</button>
    </>


   )
}
export default App;
*/





/*
import { useState } from "react";

const App=()=>{
    const [cnt ,setcnt] = useState(0)
    const dec=()=>{
        if(cnt<=0){
            alert("Not got to the negative number ")

        }
        else{
            setcnt(cnt-1)
        }
    }
    return(
        <>
        <h1>This is  Ccount porgram </h1>
        <h1>Count = {cnt}</h1>
        <button onClick={()=>{setcnt(cnt+1)}}> Increment</button>
        <button onClick={()=>{setcnt(0)}}>Zero</button>
        <button onClick={dec}>Decrement</button>
        </>
    )
}
export default App;

*/
