import TrainerDetails from './TrainerDetails';
import './App.css';
import Trainerlist from './Trainerlist';
import { BrowserRouter,Routes,Route, Link, Navigate} from 'react-router-dom';
import Home from './Home';
function App() {
  return (
    <BrowserRouter>
    <h1>My Academy Trainers App</h1>
    <Link to='/home'>Home</Link>
    {"|"}
    <Link to="/trainers">
    Show Trainers
    </Link>
    <hr/>
    <Routes>
      <Route path="/" element={<Navigate to="/home"/>}/>
      <Route path="/home" element={<Home/>}/>
      <Route path="/trainers" element={<Trainerlist/>}/>
      <Route path="/trainer/:id" element={<TrainerDetails/>}/>
  
    </Routes>
    </BrowserRouter>
  );
}

export default App;
