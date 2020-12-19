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
class OrExpression implements AbstractExpression  
{ 
    AbstractExpression expr1; 
    AbstractExpression expr2; 
  
    public OrExpression(AbstractExpression expr1, AbstractExpression expr2)  
    { 
        this.expr1 = expr1; 
        this.expr2 = expr2; 
    } 
    public boolean interpreter(String context)  
    {         
        return expr1.interpreter(context) || expr2.interpreter(context); 
    } 
}  