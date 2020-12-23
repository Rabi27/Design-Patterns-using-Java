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
public class Item {
    
    private String upCode;
    private int price;

    public Item(String upCode, int price) {
        this.upCode = upCode;
        this.price = price;
    }

    public String getUpCode() {
        return upCode;
    }

    public int getPrice() {
        return price;
    }
    
    
    
}
