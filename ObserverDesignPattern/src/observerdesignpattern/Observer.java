/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;

/**
 *
 * @author Rabi Siddique
 */
public interface Observer {
    
    //method to update the observer, used by the subject
    public void update();
    
    //attach with subject to observe, not required, but added so that the 
    //observer can query the subject to see if an update has occurred
    public void setSubject(Subject sub);
    
}
