/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern_2;

/**
 *
 * @author Rabi Siddique
 */
public class Client {
    
    public static void main(String[] main){
    
        //Creating observers
        AverageScoreDisplay avgScore = new AverageScoreDisplay();
        CurrentScoreDisplay currScore = new CurrentScoreDisplay();
        
        //Create Subject and register Observers
        CricketData cricketData = new CricketData();
        cricketData.registerObserver(avgScore);
        cricketData.registerObserver(currScore);
        
        //Change data and notify observers
        cricketData.datachanged();
        
        //Remove and avgScore observer and update score 
        cricketData.unregisterObserver(avgScore);
        cricketData.datachanged();
    
    }
    
}
