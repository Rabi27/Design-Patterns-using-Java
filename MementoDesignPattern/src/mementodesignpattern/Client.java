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
public class Client {
    
    public static void main(String[] args){
        
        FileWriterCareTaker caretaker = new FileWriterCareTaker();
        
        FileWriterUtil filewriter = new FileWriterUtil("data.txt");
        
        filewriter.write("First set of data\nMyra\nLucy\n");
        System.out.println(filewriter+"\n\n");
        
        //lets save the file
        caretaker.save(filewriter);
        
        //now write something else
        filewriter.write("Second set of data\nJason\n");
        
        //checking file contents
        System.out.println(filewriter+"\n\n");
        
        //lets undo to last save
        caretaker.undo(filewriter);
        
        //checking file content again
        System.out.println(filewriter+"\n\n");
    
    }
    
}
