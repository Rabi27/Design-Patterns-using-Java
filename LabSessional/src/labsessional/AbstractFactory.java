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
public abstract class AbstractFactory {
    
    abstract Alignment getAlignment(String alignmenttype);
    abstract FontStyles getFontStyles(String fontstyletype);
    
}
