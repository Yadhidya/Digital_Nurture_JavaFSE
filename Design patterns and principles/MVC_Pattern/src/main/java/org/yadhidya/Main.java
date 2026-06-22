package org.yadhidya;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student stu1=new Student("Yadhi","VTU28361","A");
        Student stu2=new Student("Yadhi","VTU28360","A");
StudentView view=new StudentView();
StudentController controller=new StudentController(stu1,view);
controller.displayStudentDetails();
    }
}