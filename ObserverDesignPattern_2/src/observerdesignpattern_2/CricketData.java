/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern_2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Rabi Siddique
 */
public class CricketData implements Subject {
    
    int runs;
    int wickets;
    float overs;
    ArrayList<Observer> observerList;
    
    public CricketData(){
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
      observerList.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
     observerList.remove(observerList.indexOf(o));
    }

    @Override
    public void notifyObservers() {
     
        for(Iterator<Observer> it = observerList.iterator(); it.hasNext();){
        
            Observer o = it.next();
            o.update(runs, wickets, overs);
        }
        
    }

    public int getRuns() {
        return 90;
    }

    public int getWickets() {
        return 2;
    }

    public float getOvers() {
        return (float)10.2;
    }
    
    
    
    public void datachanged(){
        runs = getRuns();
        wickets = getWickets();
        overs = getOvers();
        
        notifyObservers();
    
    }
    
    
    
}
