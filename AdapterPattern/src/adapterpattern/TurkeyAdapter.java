/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

/**
 *
 * @author Rabi Siddique
 */
public class TurkeyAdapter implements Duck {
    
    Turkey turkey;    //Duck is the target while Turkey is adaptee
    
    public TurkeyAdapter(Turkey turkey){
    
        this.turkey = turkey;
    }
    
    public void quack(){
    turkey.gobble();
    
    }
    
     public void fly(){
    turkey.fly();
    turkey.fly();
    turkey.fly();
    turkey.fly();
    turkey.fly();
    
    }
    
}
