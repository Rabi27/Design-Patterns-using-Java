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
public class QuickSort implements Sort {
    
    
    public int[] sort(int[] arr){
        
        System.out.println("Sorting the array with QuickSort Algorithm");
        
        sorting(arr,0,arr.length-1);
        
        return arr;
    
    
    }
    
    public void sorting(int[] arr,int start,int end){
        
        if(start <= end){
        
            int pi = partition(arr,start,end); 
            //Sort the left side of the pivot index
            sorting(arr,start,pi-1);
            //Sort the rigth side of the pivot index
            sorting(arr,pi+1,end);
        
        }
       
         
    
    }
    
    public int partition(int[] arr,int start,int end){
        
        //Pivot Value
        int pivot = arr[end];
        //Pointer 1
        int i = start-1;
        //Pointer 2
        int j;
        
        for(j=start;j<end;j++){
            
            if(arr[j]<pivot){
                i++;
                
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            }
        }
        
        int temp = arr[i+1]; 
        arr[i+1] = arr[end]; 
        arr[end] = temp; 
        
        return i+1;
    
    
    
    }
    
    
    

    
}
