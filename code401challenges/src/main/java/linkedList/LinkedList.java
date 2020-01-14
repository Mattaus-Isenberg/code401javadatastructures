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
            if(node.node_Data.equals(data))
            {
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

    public void append(E data)
    {
        Node<E> transitory_Node = this.head;
        while(transitory_Node.next_Node != null)
        {
            transitory_Node = transitory_Node.next_Node;
        }

        transitory_Node.next_Node = new Node<>(data);
    }

    public void insertBefore(E valToInsertBefore, E newValue)
    {
       if(this.head.node_Data.equals(valToInsertBefore))
       {
           insert(newValue);
       }
       else
       {
           Node<E> transitory_Node = this.head;
           Node<E> place_Holder;

           while(transitory_Node.next_Node.node_Data != valToInsertBefore)
           {
               transitory_Node = transitory_Node.next_Node;
           }

           place_Holder = transitory_Node.next_Node;
           transitory_Node.next_Node = new Node(newValue, place_Holder);
           //transitory_Node.next_Node.next_Node = place_Holder;
       }
    }

    public void insertAfter(E valToInsertAfter, E newValue)
    {
        Node<E> transitory_Node = this.head;
        Node<E> place_Holder;

        if(transitory_Node.node_Data.equals(valToInsertAfter))
        {
            place_Holder = transitory_Node.next_Node;
            transitory_Node.next_Node = new Node(newValue, place_Holder);
            //transitory_Node.next_Node.next_Node = place_Holder;
        }
        else
            {
                while(transitory_Node.node_Data != valToInsertAfter)
                {
                    transitory_Node = transitory_Node.next_Node;
                }

                place_Holder = transitory_Node.next_Node;
                transitory_Node.next_Node = new Node(newValue, place_Holder);
                //transitory_Node.next_Node.next_Node = place_Holder;
            }
    }


}


