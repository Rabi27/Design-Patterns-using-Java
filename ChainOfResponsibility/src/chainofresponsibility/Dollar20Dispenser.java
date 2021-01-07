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
public class Dollar20Dispenser implements DispenseChain {
    
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        
        chain = nextChain;
        
    }

    @Override
    public void dispense(Currency cur) {
        
        if(cur.getAmount() >= 20){
            int num = cur.getAmount() / 20;
            int remainder = cur.getAmount() % 20;
            System.out.println("Dispensing "+num+" $20 note");
            
            if(remainder !=0){
                this.chain.dispense(new Currency(remainder));
            }
        }
        else{
            this.chain.dispense(cur);
        
        }
        
        
    }
    
    
}
