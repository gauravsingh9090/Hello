import { useState } from "react";
import axios from "axios";
const App=()=>{
  const [input,setinput] = useState({});

  const handleInput=(e)=>{
    const name = e.target.value;
    const value  = e.target.value;

    setinput((values)=>({...values,[name]:value}))
    console.log(input)
  }
  const handleSubmit=()=>{
    const api ="http://localhost:3000/student";
    axios.post(api,input).then((res)=>{
        console.log(res);
        alert("Data savesdf")
    })
  }
  return(
    <>
      <h1>Application Form </h1>
      <label>Enter RollNo</label>
       <input type="text" name="rollno" value={input.rollno} onChange={handleInput}></input>
       <label>Enter Name </label>
       <input type="text" name="name"  value={input.name} onChange={handleInput}></input>
       <label>Enter City</label>
       <input type="text" name="city" value={input.city} onChange={handleInput} ></input>
       <label>Enter City</label>
       <input type="text" name="fees" value={input.fees} onChange={handleInput} ></input>
        
       <button onClick={handleSubmit}>Save it</button>

    </>
  )
}
export default App;


// Data base

{
  "student": [
    {
      "id": 201,
      "rollno": 2001,
      "name": "Aman",
      "city": "bhopal",
      "fees": 39538
    },
    {
      "id": "60e0",
      "rollno": "3044",
      "name": "Aman Kumar Patel",
      "city": "bhopal",
      "fees": "29493"
    },
    {
      "id": "8511"
    },
    {
      "11": "11",
      "3994": "3994",
      "id": "325e",
      "gaurav": "gaurav",
      "rewa": "rewa"
    }
  ]
}
