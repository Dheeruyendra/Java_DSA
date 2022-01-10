package Sorting;

import java.util.Scanner;

public class QuickSort {
    
  static int partition(int[] arr, int left, int right){
        int pivot = arr[right];

        int i=left-1;
        for(int j=left; j<right; j++){
            if(arr[j] < pivot){
                i+=1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
       
             arr[right] = arr[i+1];
             arr[i+1] = pivot;
             return i+1;

    }

    
    static void quickSort(int[] arr, int left, int right){
        if(left < right){
          int pi = partition(arr, left, right);

          quickSort(arr, left, pi-1);
          quickSort(arr, pi+1, right);
        }
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of array : ");

        int size = input.nextInt();
        
        int[] arr  = new int[size];

        for(int i=0; i<size; i++){
           arr[i] = input.nextInt();
        }
        
        input.close();
      
        quickSort(arr,0,size-1);

        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }

    }

}
