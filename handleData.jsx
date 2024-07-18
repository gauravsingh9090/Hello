import { useState , useEffect} from "react";
const App=()=>{
   const [name ,setname ] = useState("")
   const [city,setcity] = useState("")
  
    const handleSubmit=()=>{
      console.log({name:name, city:city})
    }
   
  return(
    <>
        <h1>Application form </h1>
        Enter name : <input type="text" value={name} onChange={(e)=>{setname(e.target.value)}}></input>
        <br>
        </br>
        Enter city : <input type="text" value={city}  onChange={(e)=>{setcity(e.target.value)}}></input>
        <br></br>
      <button onClick={handleSubmit} >Submit Data</button>
    </>
  )
}
export default App;
