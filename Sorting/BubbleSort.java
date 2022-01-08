package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        
          int[] arr = {45,98,100,120,500,1000,0,-100,-200,-10};

          for(int i=0; i<arr.length-1; i++){
              boolean isSwapped = false;
           for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]  > arr[j+1]){
                    isSwapped = true;

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
           }

             if(!isSwapped){
                 break;
             }

          }
         for(int i=0; i<arr.length; i++){
             System.out.println(arr[i]);
         }

    }
}
