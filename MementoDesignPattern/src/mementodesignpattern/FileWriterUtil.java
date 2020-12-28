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

//Originator Class
public class FileWriterUtil {
    
    private String filename;
    private StringBuilder content;
    
    public FileWriterUtil(String file){
        this.filename = file;
        this.content = new StringBuilder();
    }
    
    public String toString(){
        return this.content.toString();
    }
    
    public void write(String str){
        content.append(str);
    }
    
    //creates the memento
    public Memento save(){
        return new Memento(this.filename,this.content);
    }
    
    //restore into its earlier state
    public void UndoToLastSave(Object obj){
        
        Memento memento = (Memento) obj;
        this.filename = memento.filename;
        this.content = memento.content;
    
    }
    
    private class Memento{
    
    private String filename;
    private StringBuilder content;

        public Memento(String filename, StringBuilder content) {
            this.filename = filename;
            //A deep copy so that Memento and FileWriterUtil
            // content variables dont refer to the same object
            this.content = new StringBuilder(content);
        }
    
    
    
    
    
    }
    
}
