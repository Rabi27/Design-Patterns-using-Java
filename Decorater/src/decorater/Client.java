/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorater;

/**
 *
 * @author Rabi Siddique
 */
public class Client {
    
    public static void main(String[] args){
    
       Shape circle = new Circle();
       Shape rectangle = new Rectangle();
       
       Shape redCircle = new RedShape(new Circle());
       Shape redRectangle = new RedShape(new Rectangle());
       
       System.out.println("Circle with normal border");
       circle.draw();
       
       System.out.println("Circle with red border");
       redCircle.draw();
       
       System.out.println("Rectangle with normal border");
       rectangle.draw();
       
       System.out.println("Rectangle with red border");
       redRectangle.draw();
       
       
        
    
    }
    
}
