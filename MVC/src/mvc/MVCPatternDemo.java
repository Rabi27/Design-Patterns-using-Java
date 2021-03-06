
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
public class MVCPatternDemo {
    
    public static void main(String[] args){
        
        
      //fetch student record based on his roll no from the database
      Student model  = retriveStudentFromDatabase();

      //Create a view : to write student details on console
      StudentView view = new StudentView();
      
      
      StudentController controller = new StudentController(model, view);

      controller.updateView();

      //update model data
      controller.studentSetFirstName("Rabo");

      controller.updateView();

        
        
    }
    
    private static Student retriveStudentFromDatabase(){
      Student student = new Student("Rabi","Siddique","FA17-BSE-027",3.16);
      return student;
   }
    
}
