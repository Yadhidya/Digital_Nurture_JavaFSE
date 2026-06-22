package Employee_Management_System;

public class Employee {

  int employeeId;
  String name;
  String position;
  int salary;

  public Employee(int employeeId,
  String name,
  String position,
  int salary)
  {
    this.employeeId=employeeId;
    this.name=name;
    this.salary=salary;
    this.position=position;
  }
  public int getEmployeeId() {
    return this.employeeId;
}

public String getName() {
    return this.name;
}

public String getPosition() {
    return this.position;
}

public int getSalary() {
    return this.salary;
}
@Override
public String toString() {
    return "Employee ID: " + employeeId + 
           ", Name: " + name + 
           ", Position: " + position + 
           ", Salary: " + salary;
}

  
}
