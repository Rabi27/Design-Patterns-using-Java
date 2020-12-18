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
public class Developer implements Employee{
    
    private String name;
    private long empId;
    private String position;

    public Developer(long empId,String name, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }
    
    public void showEmployeeDetails(){
    
        System.out.println(empId+" "+name+" "+position);
    
    }
    
    
    
}