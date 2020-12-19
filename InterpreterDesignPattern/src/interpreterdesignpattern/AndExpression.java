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
class AndExpression implements AbstractExpression  
{ 
    AbstractExpression expr1; 
    AbstractExpression expr2; 
  
    public AndExpression(AbstractExpression expr1, AbstractExpression expr2)  
    {  
        this.expr1 = expr1; 
        this.expr2 = expr2; 
    } 
    public boolean interpreter(String con)  
    {         
        return expr1.interpreter(con) && expr2.interpreter(con); 
    } 
} 