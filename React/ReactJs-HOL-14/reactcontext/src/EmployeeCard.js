import React, { useContext } from 'react'
import ThemeContext from "./ThemeContext";

const EmployeeCard = ({employee}) => {
  const theme=useContext(ThemeContext);
  return (
   <div className="card">

      <h2>{employee.name}</h2>

      <h4>{employee.designation}</h4>

      <button className={theme}>
        View Details
      </button>

    </div>

  )
}

export default EmployeeCard
