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
public class RedShape extends ShapeDecorator {

    public RedShape(Shape decoratedShape) {
        super(decoratedShape);
    }
    
    public void draw(){
    
    
        decoratedShape.draw();
        setRedBorder(decoratedShape);
        
    }
    
    private void setRedBorder(Shape decoratedShape){
    
    
        System.out.println("Border Color: Red");
    }
    
}
