/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightpattern_2;

/**
 *
 * @author Rabi Siddique
 */
public class Robot implements RobotInterface {
    String robotType;
    public String colorOfRobot;

    public Robot(String robotType) {
        this.robotType = robotType;
    }
    
    public void setColor(String colorOfRobot){
        this.colorOfRobot = colorOfRobot;  
    }
    
    public void print(){
        System.out.println("This is a "+robotType+" type robot with "+colorOfRobot+" color");
    }
    
}
