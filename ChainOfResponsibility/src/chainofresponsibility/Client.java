/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

import java.util.Scanner;

/**
 *
 * @author Rabi Siddique
 */

//Handler defines an interface for handling requests
//It implements the successor link - dispatches the requests to chain of handlers

//Concrete Handler handles the requests it is responsible for
//It can also access its succesor
//If the concrete handler can handle the request it does, otherweise it forwards it to its succsor

//Client does not which part of the chain is processing the request
//It just sends request to the first object in the chain

//Each object in the chain will have its implementation to process the request
//Every object in the chain should have a reference to the next object in the chain to forward request to
//This is achieved by composition

public class Client {
    
    private DispenseChain c1;
    
    public Client(){
        
        //Initialize the chain
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();
        
        //set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    
    }
    
    public static void main(String args[]){
        Client atmDispenser = new Client();
        
        while(true){
            
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            
            if(amount % 10 != 0){
                
                System.out.println("Amount should be in multiple of 10s");
                return;
            
            }
            
            //Process the request
            atmDispenser.c1.dispense(new Currency(amount));
        }
    }
    
}
