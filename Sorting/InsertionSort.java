package Sorting;

public class InsertionSort {
    
  public static void main(String[] args) {
      
    int[] arr = {56,34,93,-100,2300,0,-1990,45550};
     
      for(int i=1; i<arr.length; i++){

        //pick an element, to be placed at correct position
        int element = arr[i];

        int j=i-1;
        while(j>=0 && arr[j]>element){
        
            arr[j+1] =arr[j];
            j--;
        }

        arr[j+1] = element;

      }

      for(int i=0; i<arr.length; i++){
          System.out.println(arr[i]);
      }

  }

}
