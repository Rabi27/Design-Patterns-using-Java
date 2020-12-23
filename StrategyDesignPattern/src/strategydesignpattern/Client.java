/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategydesignpattern;

import java.util.Arrays;

/**
 *
 * @author Rabi Siddique
 */
public class Client {
    
    public static void main(String[] args){
        
        Context c = new Context(new BubbleSort());
        int[] arr = c.performSort(new int[] {16,7,88,1,2,55});
        System.out.println(Arrays.toString(arr));
        
        Context c2 = new Context(new QuickSort());
        int[] arr2 = c2.performSort(new int[] {16,7,88,1,2,55});
       System.out.println(Arrays.toString(arr2));
    }
    
}
