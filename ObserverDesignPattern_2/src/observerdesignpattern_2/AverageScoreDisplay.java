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
public class AverageScoreDisplay implements Observer {
    
    private float runRate;
    private int predictedScore;
    

    @Override
    public void update(int runs, int wickets, float overs) {
      
        this.runRate = (float) runs/overs;
        this.predictedScore = (int)(this.runRate*50);
        display();
    }
    
    public void display(){
    
        System.out.println("Average Score Display\n"
                + "Run Rate:"+runRate
                + "\nPredictedScore:"+predictedScore
                + "");
        
    }
    
}
