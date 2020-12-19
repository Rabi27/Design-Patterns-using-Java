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
public class FactoryProducer {
    
    public static AbstractFactory getFactory(String choice){
    if(choice.equalsIgnoreCase("Alignment")){
    return new AlignmentFactoryClass();
    }
    else if(choice.equalsIgnoreCase("FontStyles")){
    return new FontStylesFactory();
    }
    
    return null;
    }
    
}
