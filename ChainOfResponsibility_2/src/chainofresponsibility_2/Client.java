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
public class Client {
    
    public static void main(String[] args){
        System.out.println("**Chain of Responsibility**\n");
        
        //Making the chain first Fax->Email
        Receiver faxHandler,emailHandler;
        emailHandler = new EmailErrorHandler();
        faxHandler = new FaxErrorHandler();
        
        faxHandler.setNextChain(emailHandler);
        IssueRaiser raiser = new IssueRaiser(faxHandler);
        
        Message m1 = new Message("Fax is reaching late to the description",MessagePriority.Normal);
        Message m2 = new Message("Email is not going",MessagePriority.High);
        Message m3 = new Message("In Email, BCC field is disabled occcasionally",MessagePriority.Normal);
        Message m4 = new Message("Fax is not reaching destination",MessagePriority.High);
        
        raiser.raiseMessage(m1);
        raiser.raiseMessage(m2);
        raiser.raiseMessage(m3);
        raiser.raiseMessage(m4);
    }
    
}
