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
public class Singleton {
   //private reference to the one and only instance
    private static Singleton uniqueInstance = null;
    
    //an instance attribute
    private int data = 0;
    
    //Singleton Contrucotr which is private
    private Singleton(){
    }
    
    //By adding the synchronized keyword to getInstance(), 
    //we force every thread to wait its turn before it can enter the method
    //This way race conditions are avoided.
    public static synchronized Singleton getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new Singleton();
        
        return uniqueInstance;
    } 

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
