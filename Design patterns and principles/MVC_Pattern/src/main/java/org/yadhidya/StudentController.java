package org.yadhidya;

public class StudentController {
    Student student;
    StudentView studentview;

    public StudentController(Student student, StudentView studentview) {
        this.student = student;
        this.studentview = studentview;
    }

    public String getName() {
        return student.getName();
    }

    public void setName(String name) {
        student.setName(name);
    }

    public String getId() {
        return student.getId();
    }

    public void setId(String id) {
       student.setId(id);
    }

    public String getGrade() {
        return student.getGrade();
    }

    public void setGrade(String grade) {
        student.setGrade(grade);
    }

    public void displayStudentDetails(){
        studentview.displayStudentDetails(student);
    }
}
