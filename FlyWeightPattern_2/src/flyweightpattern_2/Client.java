/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightpattern_2;

import java.util.Random;

/**
 *
 * @author Rabi Siddique
 */
public class Client {
    
     public static void main(String[] args) throws Exception {
        
        RobotFactory myfact = new RobotFactory();
        System.out.println("FlyWeight Pattern Example\n");
        
        RobotInterface shape;
        
         
        for(int i=0;i<3;i++){
        shape = myfact.getRobotFromFactory("King");
        shape.setColor(getRandomColor());
        shape.print();
        
        }
        
        int NumOfDistinctRobots = myfact.totalObjectsCreate();
        System.out.println("Distinct Robot objects created till now = "+NumOfDistinctRobots);
        
        for(int i=0;i<3;i++){
        shape = myfact.getRobotFromFactory("Queen");
        shape.setColor(getRandomColor());
        shape.print();
        
        }
        
        NumOfDistinctRobots = myfact.totalObjectsCreate();
        System.out.println("Finally number of Distinct Robot objects created = "+NumOfDistinctRobots);
        
         
        
    }
     
    public static String getRandomColor(){
      Random r = new Random();
      
      int random = r.nextInt(20);
      if(random%2==0)
          return "red";
      else
          return "green";
        
    }
}
