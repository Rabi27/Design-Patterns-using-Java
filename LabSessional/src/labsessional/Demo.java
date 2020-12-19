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
public class Demo {
    
    public static void main(String[] args){
        
        System.out.println("Abstract Factory Pattern");
    
        AbstractFactory alignmentFactory = FactoryProducer.getFactory("Alignment");
        Alignment a = alignmentFactory.getAlignment("Left");
        Alignment b = alignmentFactory.getAlignment("Right");
        Alignment c = alignmentFactory.getAlignment("Justified");
        a.prepare();
       
        
        
        
        AbstractFactory fontFactory = FactoryProducer.getFactory("FontStyles");
        FontStyles x = fontFactory.getFontStyles("Bold");
        FontStyles y = fontFactory.getFontStyles("Italic");
        FontStyles z = fontFactory.getFontStyles("Plain");
        x.prepare();
      
       
      
    
    }
    
}
