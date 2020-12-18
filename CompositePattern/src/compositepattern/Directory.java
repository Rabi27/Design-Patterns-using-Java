/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rabi Siddique
 */
public class Directory implements Employee{
    private List<Employee> employeeList = new ArrayList<Employee>();
    
    public void showEmployeeDetails(){
    
        for(Employee emp:employeeList){
        
            emp.showEmployeeDetails();
        
        }
    
    }
    
    public void addEmployee(Employee emp){
    
        employeeList.add(emp);
    
    }
    
    public void removeEmployee(Employee emp){
    
        employeeList.remove(emp);
    
    }
    
}
