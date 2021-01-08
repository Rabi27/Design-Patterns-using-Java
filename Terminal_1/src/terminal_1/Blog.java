/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminal_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rabi Siddique
 */
public class Blog implements Subject {
    
private List<Observer> observers;
    private String article;
    private boolean changed;

    public Blog() {
        this.observers = new ArrayList<>();
    }
    
    @Override
    public void register(Observer obj) {
        if(obj == null) throw new NullPointerException("Null Observer");
        if(!observers.contains(obj)) observers.add(obj);
    }
    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        
        if(!changed) return;
        
        observersLocal = new ArrayList<>(this.observers);
        this.changed = false;
        
        for(Observer obj: observersLocal){
            obj.update();
        }
    }
    @Override
    public Object getUpdate(Observer obj) {
        return this.article;
    }
    
    public void postBlog(String words){
         System.out.println("New Article Posted:"+words);
         this.article = words;
         this.changed = true;
         notifyObservers();
    
    }
    
}