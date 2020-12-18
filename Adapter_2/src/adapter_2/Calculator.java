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
public class Calculator implements CalculatorInterface {
    
    Rectangle rectangle;
    
    public double getArea(Rectangle r){
    
        rectangle = r;
        return rectangle.lenght*rectangle.width;
    
    }
    
}
