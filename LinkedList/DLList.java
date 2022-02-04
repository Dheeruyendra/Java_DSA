package LinkedList;

public class DLList {
    
    private static class Node {
      
        int val;
        Node next;
        Node previous;
 
        Node(int v, Node n, Node p){
            val = v;
            next = n;
            previous = p;
        }

}

     Node sentinel;
     int size;

     DLList(){
         sentinel = new Node(63, null ,null);
         size =0;
     }

     DLList(int v){
         sentinel = new Node(63, null, null); 
         sentinel.next = new Node(v, null, null);
     }



}
