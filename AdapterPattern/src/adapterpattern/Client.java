/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

/**
 *
 * @author Rabi Siddique
 */
public class Client {
    public static void main(String[] args){
    
    MallardDuck duck = new MallardDuck();
    WildTurkey turkey = new WildTurkey();
    
    Duck turkeyAdapter = new TurkeyAdapter(turkey); //Turkey Adapter is going to act like a Duck
    System.out.println("The turkey says....");
    turkey.gobble();
    turkey.fly();
    
    System.out.println("\nThe Duck says....");
    testDuck(duck);
    
    System.out.println("\nThe TurkeyAdapter says....");
    testDuck(turkeyAdapter); //Turkey disguised as a duck
    
    
    }
    
    static void testDuck(Duck duck){
    
        duck.quack();
        duck.fly();
    
    }
}
