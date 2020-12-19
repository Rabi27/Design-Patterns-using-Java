/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatedesignpattern;

/**
 *
 * @author Rabi Siddique
 */
public class SalesReport extends Report{
    
    public void queryFromTable(){
    
    System.out.println("Collecting and Querying Data from Sales Table.");
    
    }
     public void headerDisplayWithTitle(){
     
         System.out.println("Header Dislay:Sales Report");
     
     }
}
