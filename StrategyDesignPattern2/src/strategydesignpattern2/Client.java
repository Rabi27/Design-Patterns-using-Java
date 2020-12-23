/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategydesignpattern2;

/**
 *
 * @author Rabi Siddique
 */
public class Client {
    
    public static void main(String[] args){
        
        ShoppingCart cart = new ShoppingCart();
        
        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);
        
        cart.addItem(item1);
        cart.addItem(item2);
        
        cart.pay(new CreditCardStrategy("Rabi","12345678","36","12/15"));
        cart.pay(new DebitCardStrategy("Rabi","12345678","36","12/15"));
        cart.pay(new CashOnDeliveryStrategy("Rabi","Peoples Colony Grw"));
        
    
    
    }
    
}
