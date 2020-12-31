/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Rabi Siddique
 */
public class Context {
    
    private VehicleStrategy stg;

    public Context(VehicleStrategy stg) {
        this.stg = stg;
    }
    
    public double applyStrategy(double fair){
        return this.stg.discount(fair);
    }
    
}
