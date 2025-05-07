import React, { useContext } from 'react'
import { GlobalAuthContext } from './GlobalAuthContext'

const Kids = () => {
    let {user}=useContext(GlobalAuthContext);
  return (
    <div>Kids {user}</div>
  )
}

export default Kids