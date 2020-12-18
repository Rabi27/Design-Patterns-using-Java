/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rabi Siddique
 */
public class RobotFactory {
    
    Map<String,RobotInterface> shapes = new HashMap<String,RobotInterface>();
    
    public int totalObjectsCreate(){
        return shapes.size();
    }
    
    public RobotInterface getRobotFromFactory(String robotCategory) throws Exception
    {
    RobotInterface myRobot = null;
    
    if(shapes.containsKey(robotCategory)){
        myRobot = shapes.get(robotCategory);
    
    }
    else{
    
    switch(robotCategory){
        case "small":
            System.out.println("Creating a Small Robot");
            myRobot = new SmallRobot();
            shapes.put("small",myRobot);
            break;
        case "large":
            System.out.println("Creating a Large Robot");
            myRobot = new LargeRobot();
            shapes.put("large",myRobot);
            break;
        default:
            throw new Exception("Robot Factory can create only small and large shapes");
    }
    
    
}
    return myRobot;
    }
    
    
}
