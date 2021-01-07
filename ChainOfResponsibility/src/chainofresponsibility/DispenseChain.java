/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author Rabi Siddique
 */
//Handler Interface
public interface DispenseChain {
    
    //Method to define the next request processor
    void setNextChain(DispenseChain nextChain);
    //Method to process the request
    void dispense(Currency cur);
    
}
