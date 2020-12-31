/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Arrays;

/**
 *
 * @author Rabi Siddique
 */
public class Demo {
    
    public static void main(String[] args){
        
        Item Shop =new Item("Shop");
        Item Books =new Item("Books");
        Item Sale =new Item("Books Sale");
        Item Paperbacks =new Item("Paperbacks");
        Item Fiction =new Item("Fiction");
        Item NonFiction =new Item("Nonfiction");
        Item Hardware =new Item("Hardware");
        Item Desktops =new Item("Desktops");
        Item Notebooks =new Item("Notebooks");
            
            Shop.add(Books);
            Shop.add(Hardware);
            Books.add(Sale);
            Sale.add(Paperbacks);
            Books.add(Fiction);
            Books.add(NonFiction);
            Hardware.add(Desktops);
            Hardware.add(Notebooks);
            
           System.out.println(Shop);
    }
    
}
