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
public class CalculatorAdapter implements CalculatorInterface {
    
    Calculator calculator;
    Triangle t;
    
    public CalculatorAdapter(Triangle myTriangle){
    
        this.t = myTriangle;
    }
    
    public double getArea(Rectangle rectangle){
    
    calculator = new Calculator();
    
    Rectangle r = new Rectangle();
    
    r.lenght = t.base;
    r.width = 0.5*t.height;
    
    return calculator.getArea(r);
    
    }
    
}
