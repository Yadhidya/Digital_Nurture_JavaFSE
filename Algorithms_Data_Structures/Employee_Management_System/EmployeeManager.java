package Employee_Management_System;

public class EmployeeManager {

    Employee[] emps;
    int size=0,count=0,ind=0;
  EmployeeManager(int size)
  {
    emps=new Employee[size];
    this.size=size;
  }

  public void addEmp(Employee emp)
  {
    if(count<emps.length)
    {  emps[ind++]=emp;
      count++;
    }
    else
      System.out.println("Full");
  }

  public boolean searchEmp(int empId)
  {
    for(Employee emp:emps)
    {
      if(emp.getEmployeeId()==empId)
        return true;
    }
    return false;
  }

  public void display(){
     for(int i=0;i<count;i++)
    {
      System.out.println(emps[i]);
    }
  }

  public void deletEmp(int empId)
  {
    int ind=-1;
    for(int i=0;i<emps.length;i++)
    {
      if(emps[i].getEmployeeId()==empId)
      {
        ind=i;
        break;
      }
    }
    if(ind==-1)
    {
      System.out.println("Id not found");
    }
    else{
      for(int i=ind;i<emps.length-1;i++)
      {
        emps[i]=emps[i+1];
      }
      count--;
      ind--;
    }
  }
  
}
