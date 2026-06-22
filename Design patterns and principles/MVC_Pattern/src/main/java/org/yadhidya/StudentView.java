package org.yadhidya;

public class StudentView {
    void displayStudentDetails(Student student){
        System.out.println("Student Details");
        System.out.println("Name :"+student.getName());
        System.out.println("Id : "+student.getId());
        System.out.println("Grade :"+student.getGrade());
    }
}
