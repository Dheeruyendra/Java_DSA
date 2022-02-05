public class Stack{

// stack using array as container
    public static class SStack{

     int[] container;
     int capacity;
     int noOfElements;


    public SStack(int size){
  
     container = new int[size];
    noOfElements = -1;


}

void push(int element){
    container[noOfElements+1] = element;
    noOfElements++;
}

void pop(){

    if(noOfElements == -1) return;

    System.out.println(container[noOfElements]); 
    noOfElements -=1;
   

}
 
    
public boolean isEmpty(){

if(noOfElements == -1){
    return true;
}

return false;

}


public int top(){

     if(isEmpty()){
         return -1;
     }

     return container[noOfElements];

}


 public   int size(){
        if(isEmpty()) return 0;
        return noOfElements+1;
    }
    }
     public static void main(String[] args){
    
    SStack demo = new SStack(10);
   
    demo.push(10);
    demo.push(20);
    demo.pop();
    demo.push(50);

   System.out.println(demo.size());

     }

}