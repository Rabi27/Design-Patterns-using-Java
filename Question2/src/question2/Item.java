/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rabi Siddique
 */
public class Item {
   private String name;
   private List<Item> list;

  
   public Item(String name) {
      this.name = name;
      list = new ArrayList<Item>();
   }

   public void add(Item i) {
      list.add(i);
   }

   public void remove(Item i) {
      list.remove(i);
   }

   public List<Item> getHiearchy(){
     return list;
   }
   
   public String toString(){
      return ("" + name + list+"");
   } 

    
}