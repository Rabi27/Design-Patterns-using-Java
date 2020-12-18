/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;

/**
 *
 * @author Rabi Siddique
 */
public class Client {
    
    public static void main(String[] args) {
        
        Employee dev1 = new Developer(100,"Rabi Siddique","Pro Developer");
        Employee dev2 = new Developer(101,"Abur Rehman","Entry Level Developer");
        
        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);
        
        Employee man1 = new Manager(200,"Jennifer","SEO Manager");
        Employee man2 = new Manager(201,"Shoaib Uzair","Jennifer's Manager");
        
        Directory accDirectory = new Directory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);
        
         Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(accDirectory);
        companyDirectory.showEmployeeDetails();
        
       
        
    }
    
    
}
