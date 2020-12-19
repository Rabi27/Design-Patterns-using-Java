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
public class FontStylesFactory extends AbstractFactory{
    
    public FontStyles getFontStyles(String type){
        
        if(type.equalsIgnoreCase("Italic")){
        
        return new Italic();
        }
        else if(type.equalsIgnoreCase("Bold")){
        
        return new Bold();
        }
        else if(type.equalsIgnoreCase("Plain")){
        
        return new Plain();
        }
        
        
        return null;
    
    }
    
    public Alignment getAlignment(String type){
        
        return null;
    
    }
    
}
