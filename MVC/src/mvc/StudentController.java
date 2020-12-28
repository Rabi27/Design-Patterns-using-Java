/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author Rabi Siddique
 */
public class StudentController {
    
    Student model;
    StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    
    
    public String studentGetFirstName() {
        return model.name;
    }

    public void studentSetFirstName(String name) {
        model.name = name;
    }
    
     public String studentGetLastName() {
        return model.lastname;
    }

    public void studentSetLastName(String name) {
        model.lastname = name;
    }

    public String studentGetRollno() {
        return model.rollno;
    }

    public void studentSetRollno(String rollno) {
        model.rollno = rollno;
    }

    public double studentGetCgpa() {
        return model.cgpa;
    }

    public void studentSetCgpa(double cgpa) {
        model.cgpa = cgpa;
    }
    
    
    public void updateView(){				
      view.printStudentDetails(model.getName(), model.getLastname(),model.getRollno(),model.getCgpa());
   }
    
    
    
}
