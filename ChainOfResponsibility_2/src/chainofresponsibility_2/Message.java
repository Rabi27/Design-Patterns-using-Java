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

enum MessagePriority{

Normal,
High

}


public class Message {
    
    public String text;
    public MessagePriority priority;

    public Message(String text, MessagePriority priority) {
        this.text = text;
        this.priority = priority;
    }
    
    
    
}
