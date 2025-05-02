import { useContext } from "react";
import AuthContext from "./AuthContext";

  const Login=()=>{
    let obj={
        "username":"tejas",
        "password":"123",
        "email":"tej@123.com",
        "age":20,
        "mobile":1234567890
    };
     return(
        <>
        <div>Login</div>
        <AuthContext.Provider value={obj}>
        <Dashboard/>    
        </AuthContext.Provider>
        
        </>
     );
  };
  const Dashboard=()=>{
       return(
       <>
       <div>Dashboard</div>
       <NavBar/>
       </>
       );   
  };
  const NavBar=()=>{
     return(
        <>
        <div>NavBar</div>
        <Edit/></>
     );

  };
  const Edit=()=>{
    let loginOblect=useContext(AuthContext);
    return(
        <>
        <div>{loginOblect.username},{loginOblect.email}</div>
        <div>Edit</div>
        </>
    )

  };

 export default Login;

