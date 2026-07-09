import React from 'react'
import TrainersMock from './TrainersMock'
import { Link } from 'react-router-dom'
const Trainerlist = () => {
  return (
    <div>
      <h1> Trainers List</h1>
      <ul>
        {
          TrainersMock.map((trainer)=>(
            <li key={trainer.trainerId}>
              <Link to={`/trainer/${trainer.trainerId}`}>{trainer.name}</Link>

            </li>
          ))
        }
      </ul>
    </div>
  )
}

export default Trainerlist
