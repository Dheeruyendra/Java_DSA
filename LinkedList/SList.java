package LinkedList;



public class SList {
      
    private static class IntNode {
    
        int item;
        IntNode next;
  
         IntNode(int i, IntNode n){
            item = i;
            next = n;
            
        }
    }
  
    

     private  IntNode sentinel;
     private int size;
       public SList(){
          sentinel = new IntNode(69, null);
          size=0;
       }

       public SList(int x){
           sentinel = new IntNode(x, null);
           sentinel.next = new IntNode(x, null);
       }
      
      public void addFirst(int x){
            sentinel.next    = new IntNode(x, sentinel.next);
          size+=1;
       }

       public int getFirst(){
           return sentinel.next.item;
       }
  /*this is a recursive method to get size 
        private static int sizehelper(IntNode p){
            if(p.next == null) return 1;
            return 1+sizehelper(p.next);
        }
      */
       public int size(){
        return size;
    }

    public void addLast(int x){
          IntNode p = sentinel.next;

          while(p.next != null){
              p = p.next;
          }
          size+=1;
         p.next = new IntNode(x, null);
    }

       public static void main(String[] args) {
           SList list = new SList();
           System.out.println(list.getFirst());
       }

}
