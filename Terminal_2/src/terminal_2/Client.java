/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminal_2;

/**
 *
 * @author Rabi Siddique
 */
public class Client {
    
      
    public static void main(String[] args) {
        
        Code c1=new Code();
        c1.setCode("Java code");
        Platform platform1 = new JavaPlatform();
        platform1.execute(c1);
        System.out.println("");
        Code c2=new Code();
        c2.setCode("C Code ");
        

        Platform platform2 = new CPlatform();
        platform2.execute(c2);
        System.out.println("");
        

        Code c3=new Code();
        c3.setCode("C codee ");
        Platform platform3 = new CPlatform();
        platform3.execute(c3);
        

        System.out.println("");

        Code c4=new Code();
        c4.setCode("Php Code");
        Platform platform4 = new PHP();

        
        platform4.execute(c4);
        System.out.println("");
        Code c5=new Code();
        

        c5.setCode("Ruby Code");
        Platform platform5 = new Ruby();
        platform5.execute(c4);


    }

    
}
