/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatedesignpattern;

/**
 *
 * @author Rabi Siddique
 */
public abstract class Report {
    
    public final void generateReport(){
    
        headerDisplayWithTitle();
        connectWithDB();
        queryFromTable();
        storingInformationInDataStructure();
        dataDisplayInTable();
        displayFooterWithSomeAverageData();
    
    }
    
    public void connectWithDB(){
    
        System.out.println("Connecting with Database...Connected.");
    }
    
    public abstract void queryFromTable();
    
     
    public void storingInformationInDataStructure(){
    
        System.out.println("Storing Information in Data Structure");
    }
    
    public abstract void headerDisplayWithTitle();
    
    public void dataDisplayInTable(){
    
        System.out.println("Displaying Data in Table");
    }
    
    public void displayFooterWithSomeAverageData(){
    
        System.out.println("Displaying footer with some average data");
    }
}
