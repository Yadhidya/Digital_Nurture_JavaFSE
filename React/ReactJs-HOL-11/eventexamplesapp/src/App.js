import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {
  const [count,setcount]=useState(0);
  const increment=()=>{
    setcount(count=>count+1);
    alert("Hello welcome!");
  }

  const decrement=()=>{
    setcount(count=>count-1);
    alert("Hello welcome!");
  }

  const welcome=()=>{
    alert("Welcome");
  }
  const currency=()=>{
    let val=document.getElementById("option");
    console.log(val.textContent);
    if(val.value==="Euro")
    {
      let amount=Number(document.getElementById("amount").value);
      console.log("Euros",amount*100);
    }
    else
    { 
      let amount=Number(document.getElementById("amount").value);
      console.log("Rupees",amount/100);
    }
  }
  return (
    <div className="App">
      <h2>Count : {count}</h2>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <button onClick={welcome}>Say Welcome</button>
      <button>Click On me</button>
      <h2>Currency Convertor</h2>
      <label name="amount">Amount:</label>
      <input type="number" name="amount"   id="amount"/>
      <select id="option">
        <option>Euro</option>
        <option>Rupees</option>
      </select>
      <button onClick={currency}>Submit</button>
    </div>
  );
}

export default App;
