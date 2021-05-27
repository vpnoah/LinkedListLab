public class LinkedList{

   private IntNode head; //starting node of the linked list

   public LinkedList(){
      head=null;
   }
   
   public static void main(String args[]){
   
      LinkedList LL = new LinkedList(); //creates the linked list
      
      //all the methods and printout statements required       
      System.out.println("Length of list: " + LL.getLength());
    
      System.out.println("Inserting 5");
      LL.addToFront(5);
      System.out.println(LL);
      
      System.out.println("Inserting 4");
      LL.addToFront(4);
      System.out.println(LL);
      
      System.out.println("Inserting 3");
      LL.addToFront(3);
      System.out.println(LL);      
      
      System.out.println("Inserting 2");
      LL.addToFront(2);
      System.out.println(LL);
      
      System.out.println("Inserting 1");
      LL.addToFront(1);
      System.out.println(LL);
      
      System.out.println("Inserting 5");
      LL.addToFront(5);
      System.out.println(LL);
      
      System.out.println("Inserting 4");
      LL.addToFront(4);
      System.out.println(LL);
      
      System.out.println("Inserting 3");
      LL.addToFront(3);
      System.out.println(LL);      
      
      System.out.println("Inserting 2");
      LL.addToFront(2);
      System.out.println(LL);
      
      System.out.println("Inserting 1");
      LL.addToFront(1);
      System.out.println(LL);
      
      System.out.println("Deleting 1"); 
      LL.deleteFirstValue(1);
      System.out.println(LL);
      
      System.out.println("Deleting 1"); 
      LL.deleteFirstValue(1);
      System.out.println(LL);
      
      System.out.println("Inserting 10 at place 3");
      LL.insertAt(10,3);
      System.out.println(LL);

      System.out.println("Inserting 10 at place -1");
      LL.insertAt(10,-1);
      System.out.println(LL);
      
      System.out.println("Deleting at place 3");
      LL.deleteAt(3);
      System.out.println(LL);
      
      System.out.println("Deleting at place 0");
      LL.deleteAt(0);
      System.out.println(LL);
      
      System.out.println("Deleting at place 7");
      LL.deleteAt(7);
      System.out.println(LL);
      
      System.out.println("Inserting 10 at place 0");
      LL.insertAt(10,0);
      System.out.println(LL);
      
      System.out.println("Inserting 10 at place 10");
      LL.insertAt(10,10);
      System.out.println(LL);
      
      System.out.println("Deleting at place 8");
      LL.deleteAt(8);
      System.out.println(LL);
      
      System.out.println("Length of list: " + LL.getLength());
            
      System.out.println("Inserting 2");
      LL.addToFront(2);
      System.out.println(LL);
      
      System.out.println("Deleting all 2's");
      LL.deleteAllValue(2);
      System.out.println(LL);
      
      System.out.println("Finding the last index of 4: " + LL.getLastIndex(4));
      
      System.out.println("Deleting all 4's");
      LL.deleteAllValue(4);
      System.out.println(LL);
      
      System.out.println("Inserting 5");
      LL.addToFront(5);
      System.out.println(LL);
      
      System.out.println("Deleting all 5's");
      LL.deleteAllValue(5);
      System.out.println(LL);

      System.out.println("Finding the last index of 3: " + LL.getLastIndex(3));

      System.out.println("Finding the last index of 1: " + LL.getLastIndex(1));
      
      System.out.println("Inserting 6");
      LL.addToFront(6);
      System.out.println(LL);

      System.out.println("Finding the last index of 6: " + LL.getLastIndex(6));
      System.out.println(LL);
      
      System.out.println("Length of list: " + LL.getLength());
      
   }

   public int getLength(){ //method that returns the lengths of the linked list
   
      int length=0; //lengths starts out at zero
      IntNode in = head; //creates an int node for reference
      
      while(in!=null){ //when the reference is not null, it means there is something apart of the list
         length++; //the length increases
         in=in.getNext(); //and the reference moves onto the next node
      }
   
      return length;
   
   }

   public void print(){ //method that prints out the list 
   
      IntNode in = head; //an int node for reference
   
      while(in!=null){ //while the reference is not null
         System.out.println(in.getData()); //prints out the data
         in = in.getNext(); //then moves onto the next node
      }
   
   }

   public void addToFront(int data){ //method that adds an int node to the front of the list
   
      IntNode in = new IntNode(data); //creates an int node with the inputted value
      in.setNext(head); //makes the new node refernce the start of the list     
      head = in; //the head node now references the new node
   
   }

    public boolean deleteAt(int i){ //method that deletes a node at a certain index
        
         if(head == null){ //if there is nothing in the list
               return false; //returns false, ending the method
               }    
                
         if(i == 0){ //if deleting the first index
            head = head.getNext(); //redefines where head is        
            return true; //returns true, ending the method
            }   
               
          int counter = 1;      
          IntNode current = head.getNext(); //the node we are looking at      
          IntNode prev = head; //the previous node     
                
          while(counter != i && current != null){ //goes through the list, until ending up at the node we want
            prev = current;         
            current = current.getNext();         
            counter++;      
            }   
               
           if(current == null){ //if the node we are on is null    
             return false; //returns false, ending the method
             }    
              
           prev.setNext(current.getNext()); //sets the previous node, to one past the current one, skipping over the one we are on      
                 return true;   //returns true to end the method
           
         }   
   
    public boolean insertAt(int input, int index){ //method to insert a specific value at a specific index
      
         IntNode insert = new IntNode(input); //creates a node with the int inputted
              
         if(index<=0){ //case if the index is zero or less --> adds to the front
            addToFront(insert.getData());
            return true; //return statement to early end the method
            }
         
         IntNode pointer = head; //creates a reference node
                 
         if(index>=getLength()){ //if the index is greater than length, sets it to the end
            index=getLength();
         }
         
         for(int i=1; i<index; i++){ //starts at first index and moves the reference to the desired spot
            pointer=pointer.getNext();
         }
        
         insert.setNext(pointer.getNext()); //inserts the node
         pointer.setNext(insert);
         
         return true;
         
      }
      
   public void deleteAllValue(int value){ //method to delete all int nodes of a certain value
   
      boolean finished=false; //boolean to track if the method is over
      
      while(!finished){ //if we are not finished
      
         finished=true; //assumes we are done to start
         IntNode in = head; //creates a reference node
         
         for(int i=0; i<getLength(); i++){ //goes through all the nodes
            if(in.getData()==value){ //if we see that value
               finished=false; //sets it to not being finished
               }
            in=in.getNext();
         }
      
         deleteFirstValue(value); //runs the delete method
      
      }
   
   
   }   
      
   public String toString(){ //makes a string of the linked list
   
      String s = "Printing the list: ";
      
      IntNode start = head;
      
      for(int i=0; i<getLength(); i++){
         
         s+=start.getData() + " ";
         start=start.getNext();
      
      }
   
      return s;
   
   }

   public void deleteFirstValue(int value){ //method to delete the first node of an inputted value
   
      IntNode pointer=head; //creates a reference node
     
      if(pointer.getData()!=value){ //if the first value is not the input
     
         for(int i=0; i<getLength(); i++){ //goes through the linked list
      
            if(pointer.getNext()!=null){ //if the next int node is not null
               if(pointer.getNext().getData()!=value){ //if that node is not the specific value
                  pointer=pointer.getNext();} //moves onto the next node
            }      
         }
      }
      else if(head.getData()==value){ //if the head node has the value
         head=head.getNext(); 
      }
      
      if(pointer.getNext()!=null){ //if pointer does not point to null
         pointer.setNext(pointer.getNext().getNext()); //makes it jump over the next node
         }
      else{ 
         pointer.setNext(null);
         }
       
   }
   
   public int getLastIndex(int value){ //method to get the last index of a specific value
   
      int index = -1; //returns -1 if there that value is not in the linked list
      IntNode start = head; //creates a reference node
            
      for(int i=0; i<getLength(); i++){ //does through the linked list
      
         if(start.getData()==value){ //if the value is found
            index=i; //sets the index value to the node index
            }
            
         start=start.getNext();
      
      }
   
      return index;
   
   }

}

