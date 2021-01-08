/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminal_1;

/**
 *
 * @author Rabi Siddique
 */
public interface Subject {
    
 
    public void register(Observer obj);
    public void unregister(Observer obj);
    public void notifyObservers();
    
    //Method to get updates from subject, not required, but, added so observers can query
    public Object getUpdate(Observer obj);
    
}