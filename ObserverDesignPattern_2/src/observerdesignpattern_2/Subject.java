/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern_2;

/**
 *
 * @author Rabi Siddique
 */
public interface Subject {
    
    public void registerObserver(Observer o);
    public void unregisterObserver(Observer o);
    public void notifyObservers();
    
}
