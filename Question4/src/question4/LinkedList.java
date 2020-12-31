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
public class LinkedList implements ListContainer {
    Node head;
    
   
    public void insertItem(int value){
        
        Node newNode = new Node(value);
        
        if(head == null){
            
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
            
    }
    
   
    
    public int getLength(LinkedList list){
        int length = 0;
        Node temp = head;
        
        while(temp != null){
            temp = temp.next;
            length = length + 1;
        }
    
        return length;
    
    }
    
   public int getElementByIndex(int index){
       int element = 0;
       Node temp = head;
       
       for(int i=0;i<=index;i++){
           element = temp.value;
           temp = temp.next;
       }
       
       return element;
   }
   
   public Iterator getIterator() {
      return new ListIterator();
   }

   private class ListIterator implements Iterator {
       

      public boolean hasNext(){
            if(cursor.next == null)
            {
            return true;
            }
            return false;
            }

public E next()
{
if(hasNext())
{
throw new NoSuchElementException("No next element");
}
E toReturn = cursor.data;
cursor = cursor.next;
return toReturn;
}
	
   }
    

    
}
