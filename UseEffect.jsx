import { useEffect ,useState } from "react";
const App=()=>{
     const [cnt ,setcnt] = useState(0)

  useEffect (()=>{
      setTimeout(()=>{
        setcnt(cnt+1)
      },500)
        
  },[])

  return(
    <>
    <h1>Welcome to Cybrom Bhopal!!!!!! : {cnt}</h1>
    </>
  )
}
export default App;
