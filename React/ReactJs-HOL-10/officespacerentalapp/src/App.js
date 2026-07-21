import logo from './logo.svg';
import './App.css';

function App() {
    const element="office Space"
    const att=<img src="" width="25%" height="25%" alt="office space"/>
    const itemname={Name:"DBS",Rent:500000,Address:'Chennai'}
  return (
    <div className="App">
     <h1>Name :{element}</h1>
     {att}
     <h2>Name :{itemname.Name}</h2>
     <h3 style={{color:itemname.Rent<=60000?"red":"green"}}>Rent : Rs.{itemname.Rent}</h3>
     <h3>Address :{itemname.Address}</h3>
    </div>
  );
}

export default App;
