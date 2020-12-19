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
public class InterpreterDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  
    { 
        AbstractExpression person1 = new TerminalExpression("Salman"); 
        AbstractExpression person2 = new TerminalExpression("Shoaib"); 
        AbstractExpression isGraduated = new OrExpression(person1, person2);
        System.out.println(isGraduated.interpreter("Salman")); 
        System.out.println(isGraduated.interpreter("Shoaib"));
        System.out.println(isGraduated.interpreter("Asad")); 
          
        
        AbstractExpression person3 = new TerminalExpression("Asad"); 
        AbstractExpression married = new TerminalExpression("Married"); 
        AbstractExpression isMarried = new AndExpression(person3, married);     
  
        System.out.println(isMarried.interpreter("Married, Asad")); 
        System.out.println(isMarried.interpreter("Single, Asad")); 
  
    } 
}
