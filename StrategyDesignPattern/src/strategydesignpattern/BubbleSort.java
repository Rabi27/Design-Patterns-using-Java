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
public class BubbleSort implements Sort {
    
         public int[] sort(int[] arr){
             
         System.out.println("Sorting the array with BubbleSort Algorithm");
         int temp;
         
         for(int i=0;i<arr.length;i++){
             
             for(int j=i+1;j<arr.length;j++){
                 
                 if(arr[i]>arr[j]){
                 
                     temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
             }
         }
         
         
         return arr;
     }
    
}
