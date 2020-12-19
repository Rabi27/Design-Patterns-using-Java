/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsessional;

/**
 *
 * @author Rabi Siddique
 */
public class AlignmentFactoryClass extends AbstractFactory{
    public Alignment getAlignment(String type){
        
        if(type.equalsIgnoreCase("Left")){
        
        return new Left();
        }
        else if(type.equalsIgnoreCase("Right")){
        
        return new Right();
        }
        else if(type.equalsIgnoreCase("Justified")){
        
        return new Justified();
        }
        
        
        return null;
    
    }
    
    public FontStyles getFontStyles(String type){
        
        return null;
    
    }
        
    
}
