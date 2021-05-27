public class IntNode{

   private int data;
   private IntNode next;

   public IntNode(){
      next=null;
   }
   
   public IntNode(int input){
      next=null;
      data=input;
   }
   
   public void setData(int input){
      data=input;
   }
   
   public int getData(){
      return data;
   }
   
   public void setNext(IntNode input){
      next=input;
   }
   
   public IntNode getNext(){
        return next;
   }




}