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
        
        Sort bubblesort = new BubbleSort();
        Sort quicksort = new QuickSort();
        
       int[] arr =  bubblesort.sort(new int[] {16,7,88,1,2,55});
       int[] arr2 =  quicksort.sort(new int[] {16,7,88,1,2,55});
       
       System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(arr2));
    }
    
}
