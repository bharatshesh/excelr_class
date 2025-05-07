import React, { useState } from 'react'
const Controlled = () => {
    let [data,setData]=useState();
    
    return (
        <>
        <div>{data}</div>
        <input type="text" onChange={(e)=>setData(e.target.value)}/>
        </>


        
    )
}

export default Controlled