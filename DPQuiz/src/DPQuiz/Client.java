/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DPQuiz;
/**
 *
 * @author Rabi Siddique
 */


public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("FA17-BSE-060 - Asad Imtiz");
       
        String method = "night"; 
        Context cxt  = new Context(new Home());
        cxt.decide(method);
        
        
        
        
        
    }
    
}
