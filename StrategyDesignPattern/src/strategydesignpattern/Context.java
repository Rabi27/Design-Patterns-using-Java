/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategydesignpattern;

/**
 *
 * @author Rabi Siddique
 */
public class Context {
    
    private final Sort s;

    public Context(Sort s) {
        this.s = s;
    }
    
    public int[] performSort(int[] arr){
        
         arr = s.sort(arr);
         return arr;
    
    }
    
    
}
