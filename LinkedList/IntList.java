package LinkedList;



public class IntList {
    
     int data;
     IntList backwardNode;
     

     IntList(int d, IntList bNode){
              data = d;
              backwardNode = bNode; 

     }

    public static void  main(String[] args) {
        
       IntList l = new IntList(40, null);

             l   = new IntList(50, l);
             
             l = new IntList(60, l);

             System.out.println(l.getSize());
             System.out.println(l.iterativeSize());
            System.out.println(l.get(3));
    }


   public  int getSize(){
    

        if( backwardNode == null) return 1;

        return 1+ this.backwardNode.getSize();

    }

    public int iterativeSize(){
         IntList p =  this;
         int size =0;

         while(p!=null){
             size+=1;
             p=p.backwardNode;
         }
         return size;
    }

    public int get(int i){
        if(i==1){
            return this.data;
        }
        return get(i-1);

    }

}
