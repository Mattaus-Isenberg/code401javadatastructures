package linkedList;

import java.io.*;

public class LinkedList<E> {

    Node<E> head;

    static class Node<E> {
        public E node_Data;
        Node next_Node;

        Node(E data) {
            this(data, null);
        }

        Node(E data, Node next){
            node_Data = data;
            next_Node = next;
        }
    }


    public void insert(E data) {
        if (this.head == null)
        {
            this.head = new Node(data);
        }
        else {
            this.head = new Node(data, this.head);
        }
    }


    public boolean includes(E data){
        Node<E> node = this.head;

        while(node != null)
        {
            if(node.node_Data.equals(data)){
                return true;
        }
            node = node.next_Node;

    }
        return false;
    }


    public  String toString() {
        String returnedString = "";
        Node<E> current_Node = head;
            while (current_Node != null) {
             returnedString += "{ " + current_Node.node_Data.toString();

             if(current_Node.next_Node == null){
                 returnedString += " } -> NULL";
             }else{
                 returnedString += " } -> ";
             }
             current_Node = current_Node.next_Node;
            }
        return returnedString;



       // StringJoiner returnedString = new StringJoiner("}{", "{", "}") ;
      //  Node<E> current_Node = head;
       // while (current_Node != null) {
        //    returnedString.add("{ ");
          //  returnedString.add(current_Node.node_Data.toString());
           // if(current_Node.next_Node == null){
             //   returnedString.add( " } -> NULL");
          //  }else{
            //    returnedString.add( " } -> ");
          //  }
         //   current_Node = current_Node.next_Node;
      //  }
      //  return returnedString.toString();
        }


}


