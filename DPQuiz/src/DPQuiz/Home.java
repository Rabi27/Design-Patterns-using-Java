/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DPQuiz;
/**
 *
 * @author Rabi Siddique
 */

public class Home implements Themes {

     @Override
    public void morningTheme() {
        System.out.println("Morning theme Applied");
      
    }

    @Override
    public void eveningTheme() {
        System.out.println("Applying Evening theme");
       
    }

    @Override
    public void nightTheme() {
        System.out.println("Applying Night theme");
        
    }
    
}
