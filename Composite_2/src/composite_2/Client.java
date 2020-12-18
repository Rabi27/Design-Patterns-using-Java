/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite_2;

/**
 *
 * @author Rabi Siddique
 */
public class Client {
    
    public static void main(String[] args) {
        
        Employee dev1 = new Developer(100,"Rabi Siddique","Pro Developer");
        Employee dev2 = new Developer(101,"Abur Rehman","Entry Level Developer");
        
        Manager engManager = new Manager("Asad Imtiaz",25000);
        engManager.addEmployee(dev1);
        engManager.addEmployee(dev2);
        
        Employee dev3 = new Developer(102,"Oneeb Khan","Junior Developer");
        
        
        
        Manager genManager = new Manager("Salman Tanvir",50000);
        genManager.addEmployee(dev3);
        genManager.addEmployee(engManager);
        genManager.showEmployeeDetails();
        
        
        
       
        
    }
    
    
}