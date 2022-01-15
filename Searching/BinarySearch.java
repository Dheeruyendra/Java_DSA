package Searching;

import java.util.Scanner;

public class BinarySearch {

   static int binarySearch(int[] arr, int low, int high, int key){
           
       if(low <= high ){
           int mid = low + (high-low)/2;

           if(arr[mid] == key ){
               return mid;
           }
           else if(arr[mid] < key){
               return binarySearch(arr, mid+1, high, key);
           }
           return binarySearch(arr, low, mid-1, key);
       }

        return -1;
    }
    public static void  main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.println("Enter size of array");

        int size = input.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the element needs to be searched");

        int key = input.nextInt();
        
        input.close();

        System.out.println(binarySearch(arr,0,size-1, key));
        
    }
}
