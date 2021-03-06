package linkedList;

import java.io.*;
import java.util.StringJoiner;

public class LinkedList<E>
{

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


    public boolean includes(E data)
    {
        Node<E> node = this.head;

        while(node != null)
        {
            if (node.node_Data.equals(data))
            {
                return true;
            }
            node = node.next_Node;
        }
        return false;
    }


    public  String toStringTest()
    {
        StringJoiner returnedString = new StringJoiner("}{", "{", "") ;
          Node<E> current_Node = head;
         while (current_Node != null)
         {
             //returnedString.add("{ ");
             String dataAsText = current_Node.node_Data.toString();
             returnedString.add(dataAsText);
             returnedString.add( "} -> ");
         if(current_Node.next_Node == null){
           returnedString.add( " } -> NULL");
          }
         current_Node = current_Node.next_Node;
          }
          return returnedString.toString();
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
        }
        else
            {
                while(transitory_Node.node_Data != valToInsertAfter)
                {
                    transitory_Node = transitory_Node.next_Node;
                }

                place_Holder = transitory_Node.next_Node;
                transitory_Node.next_Node = new Node(newValue, place_Holder);
            }
    }


    public E kthFromEnd(int k)
    {
        Node<E> current_Node = this.head;
        Node<E> transitory_Node = this.head;
        int place_Count = 0;

        if(k < 0)
        {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        else if(current_Node == null)
        {
            throw new IllegalArgumentException("Element out of bounds");
        }

        while(current_Node.next_Node != null)
        {
            current_Node = current_Node.next_Node;
            place_Count++;

            if(place_Count > k)
            {
                transitory_Node = transitory_Node.next_Node;
            }
        }

        if(place_Count < k)
        {
            throw new IllegalArgumentException("Element out of bounds");
        }
        return transitory_Node.node_Data;
    }

    public static LinkedList mergeLists(LinkedList list_One_Argument, LinkedList list_Two_Argument)
    {
        Node list_One_Current = list_One_Argument.head;
        Node list_Two_Current = list_Two_Argument.head;


        while (list_One_Current != null && list_Two_Current != null)
        {
            list_Two_Argument.head = list_Two_Current.next_Node;
            list_Two_Current.next_Node = list_One_Current.next_Node;
            list_One_Current.next_Node = list_Two_Current;
            list_One_Current = list_Two_Current.next_Node;
            list_Two_Current = list_Two_Argument.head;
        }
        return list_One_Argument;
    }

    private static Node mergeRec(Node one, Node two)
    {
        if(one == null) return two;
        if(two == null) return one;

        one.next_Node = mergeRec(two, one.next_Node);
        return one;
    }

    public static LinkedList mergeRec(LinkedList one, LinkedList two)
    {
        one.head = mergeRec(one.head, two.head);
        return one;
    }

    public static void main(String[] args)
    {
        LinkedList one = new LinkedList();
        one.insert(5);
        one.insert(3);
        one.insert(1);

        LinkedList two = new LinkedList();
        two.insert(6);
        two.insert(4);
        two.insert(2);

        LinkedList merged = mergeRec(one, two);

        System.out.println(merged);
    }

}


