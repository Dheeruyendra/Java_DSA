package Sorting;

import java.util.Scanner;

public class MergeSort{
  

   static void merge(int[] arr, int left, int mid, int right){
         
    //size of first subarray
           int size1 = mid-left+1;
    //size of second subarray       
           int size2 = right-mid;
     
           //first subarray of size1
           int[] temp1 = new int[size1];
           //second subarray of size2
           int[] temp2 = new int[size2];
           
           //copying element in first subarray (elements are being copied from left of parent array till mid)
           for(int i=0; i<size1; i++){
               temp1[i] = arr[i+left];           
            }
         
           //copying element in second subarray (elements are being copied from mid+1 of parent array till right)
            for(int i=0; i<size2; i++){
                temp2[i] = arr[i+mid+1];
            }

          int  t1=0;
          int  t2=0;
          // 'p' pointer for filling elements in sorted order (parent array starting index is left) 
          int p=left;

            while(t1<size1 && t2<size2){
                if(temp1[t1] <= temp2[t2]){
                    arr[p++] = temp1[t1++];
                }
                else{
                    arr[p++] = temp2[t2++];
                }
            }

          while (t1<size1) {
              arr[p++] = temp1[t1++]; 
          }

          while (t2<size2) {
              arr[p++] = temp2[t2++];
          }

          
} 


     static void mergeSort(int[] arr, int si, int ei){
           if(si<ei){
           //mid point 
            int mid = si+(ei-si)/2;
              
            //mergeSort is called on first half of array
               mergeSort(arr, si, mid);
            
            //mergeSort is called on second half of array   
               mergeSort(arr, mid+1, ei);
            
            //mergeing both sorted subarray   
               merge(arr, si, mid, ei);
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

          mergeSort(arr, 0, size-1);
          
          for(int i=0; i<size; i++){
              System.out.println(arr[i]);
          }
      }

}