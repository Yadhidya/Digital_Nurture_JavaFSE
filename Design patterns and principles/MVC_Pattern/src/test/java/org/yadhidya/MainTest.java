package org.yadhidya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void mvctest(){
        Student stu1=new Student("Yadhi","VTU28361","A");
        Student stu2=new Student("Yadhi","VTU28360","A");
        StudentView view=new StudentView();
        StudentController controller=new StudentController(stu1,view);
        controller.displayStudentDetails();
    }

}