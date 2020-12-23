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
public class CashOnDeliveryStrategy implements PaymentStrategy {
    
    private String name;
    private String address;

    public CashOnDeliveryStrategy(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    public void pay(int amount){
        System.out.println(amount+"$ shall be paid to receive order");
    }
    
    
}
