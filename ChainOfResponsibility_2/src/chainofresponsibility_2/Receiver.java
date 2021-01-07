/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility_2;

/**
 *
 * @author Rabi Siddique
 */
public interface Receiver {
    
    boolean processMessage(Message msg);
    void setNextChain(Receiver nextChain);
    
}
