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
public class IssueRaiser {
    
    public Receiver setFristReceiver;

    public IssueRaiser(Receiver setFristReceiver) {
        this.setFristReceiver = setFristReceiver;
    }
    
    public void raiseMessage(Message msg){
        if(setFristReceiver != null){
            setFristReceiver.processMessage(msg);  
        }
    }
    
}
