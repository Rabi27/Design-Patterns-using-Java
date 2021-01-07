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
public class EmailErrorHandler implements Receiver{
    
    private Receiver nextReceiver;

    @Override
    public boolean processMessage(Message msg) {
        
         if(msg.text.contains("Email")){
             System.out.println("EmailErrorHandler processed "+msg.priority+"priority issue"+msg.text);
             return true;
         }
         else{
             if(nextReceiver != null){
                 nextReceiver.processMessage(msg);
             }
         }
         return false;
    }

    @Override
    public void setNextChain(Receiver nextChain) {
        
        this.nextReceiver = nextChain;
    }
    
}
