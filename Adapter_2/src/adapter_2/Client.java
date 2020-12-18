/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter_2;

/**
 *
 * @author Rabi Siddique
 */
public class Client {
    
    public static void main(String[] args){
    
    System.out.println("***Adapter Pattern Demo**");
    
    Triangle t = new Triangle(20,10);
    
    CalculatorInterface c = new CalculatorAdapter(t);
   
    System.out.println("Area of Triangle is: "+c.getArea(null));
    
    }
    
}
