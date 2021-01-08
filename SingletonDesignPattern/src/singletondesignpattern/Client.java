/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletondesignpattern;

/**
 *
 * @author Rabi Siddique
 */

//Ensure that class has only one instance
//Provide a global point of access to it
//We are taking a class and letting it manage a single instance of itself

//Implementation Details
//There is a always gonna be a private construcotr
//This is done to restrict instantiation of the class from other classes

//There is a private static variable of the same class
//That is the only instance of the class

//There is a public static method that returns the instance of the class
//This method is the global access point for outer world to get instance of the singletion class




public class Client {
    
    public static void main(String[] args){
    
        //You can access static methods without creating an object
        Singleton s = Singleton.getInstance();
        
        //set the data value
        s.setData(55);
        
        System.out.println("First Reference: "+s);
        System.out.println("Singleton data value is:"+s.getData());
        
        //Get another reference to the Singleton
        //Is it the same object
        s = null;
        s = Singleton.getInstance();
        
        System.out.println("Second Reference: "+s);
        System.out.println("Singleton data value is:"+s.getData());
        
        
            
        
    
    }
    
}
