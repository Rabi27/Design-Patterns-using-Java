/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightpattern;

import java.util.HashMap;

/**
 *
 * @author Rabi Siddique
 */
public class FlyweightPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        RobotFactory myfact = new RobotFactory();
        System.out.println("FlyWeight Pattern Example\n");
        
        RobotInterface shape = myfact.getRobotFromFactory("small");
        shape.print();
        
        for(int i=0;i<2;i++){
        shape = myfact.getRobotFromFactory("small");
        shape.print();
        
        }
        
        int NumOfDistinctRobots = myfact.totalObjectsCreate();
        System.out.println("Distinct Robot objects created till now = "+NumOfDistinctRobots);
        
        for(int i=0;i<5;i++){
        shape = myfact.getRobotFromFactory("large");
        shape.print();
        
        }
        
        NumOfDistinctRobots = myfact.totalObjectsCreate();
        System.out.println("Finally number of Distinct Robot objects created = "+NumOfDistinctRobots);
        
         
        
    }
    
    
    
    
    public static void HashMapBasics(){
        //HashMap
        HashMap<String,Integer> h = new HashMap(); //<String,Integer> specifies that keys are Strings and their values are Integers
        h.put("a",10); //put method takes two arguments, a key and its value
        h.put("b",12);
        h.put("c",14);
        System.out.println(h);
        System.out.println(h.get("c")); //get method takes argument of the key and returns the corresponding value to the key
        System.out.println(h.get("d")); //If the key does not exists in the hashmap, then the get method returns null.
    }
    
    public static void HashMapLogin(){
    
        HashMap<String,String> h = new HashMap();
        h.put("rabisiddique27@gmail.com","12345");
        h.put("shoaibuzair12@gmail.com","xyzzyz");
        h.put("fluffy123@gmail.com","abcdef");
        h.put("asadimitiaz60@gmail.com","abc123");
        
        h.remove("fluffy123@gmail.com");
        System.out.println(h);
        System.out.println(h.get("rabisiddique27@gmail.com"));
        System.out.println(h.containsKey("rabisiddique27@gmail.com")); //containsKey method checks whether a certain key is present in hashmap or not. It returns true or false.
        System.out.println(h.containsValue("12345")); //containsValue checks if a certain value is present in hashmap or not.
        System.out.println(h.size()); //returns the size of the hashmap
        System.out.println(h.replace("rabisiddique27@gmail.com","rabisiddique")); //replaces the value of the given key
        System.out.println(h);
        
        System.out.println(h.values()); //returns all the values of the hashmap
        System.out.println(h.keySet()); //returns all the keys of the hashmap 
        
        
        
    
    }
    
}
