package Task_Management_System;

public class TaskManager {
  node head;
  node temp;
  TaskManager(){

  }

  public void addTask(Task task)
  {
    if(head==null){
      head=new node(task);
      temp=head;
    }
    else{
      temp.next=new node(task);
      temp=temp.next;
    }
  }

  public boolean searchTask(Task task)
  {
    node t=head;
    while(t!=null)
    {
      if(t.task.getTaskId()==task.getTaskId())
        return true;
      t=t.next;
    }
    return false;
  }

  public void display(){
    node t=head;
    System.out.println("Tasks details :");
     while(t!=null)
    {
      System.out.println(t.task);
      t=t.next;
    }

  }

  public void delete(int taskid)
  {
    if(head==null)
      return;
    if(head.task.getTaskId()==taskid)
    {
      if(head.next==null)
        head=null;
      else
        head=head.next;
    }
    else
    {
      node t=head;
      node prev=head;
      while(t!=null)
      {
        if(t.task.getTaskId()==taskid)
        {
          prev.next=t.next;
          break;
        }
        prev=t;
        t=t.next;
      }
    }
  }
  
}
class node
{
  Task task;
  node next;
  public node(Task task)
  {
    this.task=task;
  }
}
