/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementodesignpattern;

/**
 *
 * @author Rabi Siddique
 */
public class FileWriterCareTaker {
    
    private Object obj;
    
    public void save(FileWriterUtil filewriter){
        
        this.obj = filewriter.save();
    
    }
    
    public void undo(FileWriterUtil filewriter){
        
        filewriter.UndoToLastSave(obj);
    }
    
}
