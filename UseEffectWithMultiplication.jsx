import { useState , useEffect} from "react";
const App=()=>{
   const [cnt ,setcnt ] = useState(0)
   const [multi,setmulti] = useState(0)

   useEffect(()=>{
    setmulti(cnt*2)
   },[cnt])
  return(
    <>
      <h1> Welcome to my blog</h1>
      <h2>my count {cnt}</h2>
      <h2>my multi { multi}</h2>
      <button onClick={()=>{setcnt(cnt+1)}}>Click Here</button>
    </>
  )
}
export default App;
