/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author Rabi Siddique
 */
public class Client {
    
    public static void main(String[] args){
        
        LinkedList list = new LinkedList();
        list.insertItem(12);
        list.insertItem(13);
        list.insertItem(34);
        list.insertItem(66);
        list.insertItem(45);
        
        
        
       ListRepository listRepository = new ListRepository(list);

      for(Iterator iter = listRepository.getIterator(); iter.hasNext();){
        int value = (int)iter.next();
         System.out.println("Number : " + value);
      } 	
   }
    
    
    
    }
    

