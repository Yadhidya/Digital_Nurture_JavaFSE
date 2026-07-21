import './App.css';
import { useState } from 'react';
import { Login } from './Components/Login';
import { LogOut } from './Components/LogOut';

function App() {

  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    <div className="App" style={{ textAlign: "center", marginTop: "100px" }}>

      {isLoggedIn ? (
        <>
          <h1>Welcome Back</h1>
          <LogOut onLogout={() => setIsLoggedIn(false)} />
        </>
      ) : (
        <>
          <h1>Please Login</h1>
          <Login onLogin={() => setIsLoggedIn(true)} />
        </>
      )}

    </div>
  );
}

export default App;