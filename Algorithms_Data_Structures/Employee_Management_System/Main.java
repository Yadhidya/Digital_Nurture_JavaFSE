package Employee_Management_System;

public class Main {
  public static void main(String[] args) {
   EmployeeManager manager=new EmployeeManager(10);
    manager.addEmp(new Employee(101, "Yadhi", "CEO", 100000));
    manager.addEmp(new Employee(102, "Arjun", "CTO", 95000));
    manager.addEmp(new Employee(103, "Priya", "CFO", 92000));
manager.display();
manager.searchEmp(101);
manager.deletEmp(103);
manager.display();
  }
}
