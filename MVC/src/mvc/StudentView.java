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
public class StudentView {
    
    public void printStudentDetails(String studentName,String studentLastName,String studentRollno, double cgpa){
        System.out.println("Student Name:"+studentName+" "+studentLastName);
        System.out.println("Student RollNo:"+studentRollno);
        System.out.println("Student CGPA:"+cgpa);
    }
    
}
