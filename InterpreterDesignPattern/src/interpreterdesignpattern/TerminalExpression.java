/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreterdesignpattern;

/**
 *
 * @author Rabi Siddique
 */
class TerminalExpression implements AbstractExpression  
{ 
    String data; 
  
    public TerminalExpression(String data) 
    { 
        this.data = data;  
    } 
  
    public boolean interpreter(String context)  
    { 
        if(context.contains(data)) 
        { 
            return true; 
        } 
        else
        { 
            return false;   
        } 
    } 
} 