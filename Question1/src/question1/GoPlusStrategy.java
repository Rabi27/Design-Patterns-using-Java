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
public class GoPlusStrategy implements VehicleStrategy {

    @Override
    public double discount(double fair) {
        
        return fair - (fair*35/100);
    }
    
    
}
