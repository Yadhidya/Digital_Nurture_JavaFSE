import logo from './logo.svg';
import './App.css';
import CalculateScore from '../src/Components/CalculateScore';

function App() {
  return (
    <div className="App">
     <CalculateScore  Name={"Yadhidya"} School={"Veltech"}  total={283} goal={5}/>

    </div>
  );
}

export default App;
