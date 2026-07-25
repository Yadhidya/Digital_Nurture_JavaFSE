import "./App.css";
import { useState } from "react";
import ThemeContext from "./ThemeContext";
import EmployeeList from "./EmployeeList";

function App() {

  const [theme, setTheme] = useState("light");

  const employees = [
    { id: 1, name: "John", designation: "Software Engineer" },
    { id: 2, name: "Alice", designation: "Tester" },
    { id: 3, name: "David", designation: "Manager" }
  ];

  return (
    <ThemeContext.Provider value={theme}>

      <div className="App">

        <h1>Employee Management</h1>

        <button
          onClick={() =>
            setTheme(theme === "light" ? "dark" : "light")
          }
        >
          Change Theme
        </button>

        <EmployeeList employees={employees} />

      </div>

    </ThemeContext.Provider>
  );
}

export default App;