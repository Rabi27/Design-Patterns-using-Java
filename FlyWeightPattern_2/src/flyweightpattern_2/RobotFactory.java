/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightpattern_2;

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
    
    public RobotInterface getRobotFromFactory(String robotType) throws Exception
    {
    RobotInterface myRobot = null;
    
    if(shapes.containsKey(robotType)){
        myRobot = shapes.get(robotType);
    
    }
    else{
    
    switch(robotType){
        case "King":
            System.out.println("Creating a King Robot");
            myRobot = new Robot("King");
            shapes.put("King",myRobot);
            break;
        case "Queen":
            System.out.println("Creating a Queen Robot");
            myRobot = new Robot("Queen");
            shapes.put("Queen",myRobot);
            break;
        default:
            throw new Exception("Robot Factory can create only King and Queen shapes");
    }
    
    
}
    return myRobot;
    }
    
    
}