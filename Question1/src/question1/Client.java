/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Rabi Siddique
 */
public class Client {
    
    public static void main(String[] args){
        Context c1 = new Context(new RikshawStrategy());
        System.out.println("Rikshaw Discount:"+c1.applyStrategy(100));
        
        Context c2 = new Context(new GoMiniStrategy());
        System.out.println("GoMini Discount:"+c2.applyStrategy(100));
        
        Context c3 = new Context(new GoPlusStrategy());
        System.out.println("GoPlus Discount:"+c3.applyStrategy(100));
        
      
        
    }
    
}
