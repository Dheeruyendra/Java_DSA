package Sorting;

/**
 * SelectionSort
 */
public class SelectionSort {
 

     public static void  main(String[] args) {
          int[] arr = {45,0,34,99,23,5,1,999,0};
         
          for(int i=0; i<arr.length-1; i++){
            int minIndex = i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

          }

          for(int i=0; i<arr.length; i++){
              System.out.print(arr[i] + " ");
          }

     }

    
}