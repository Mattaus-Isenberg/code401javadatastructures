package linkedList;

import java.io.*;

public class LinkedList<E> {

    Node<E> head;

    static class Node<E> {
        public E node_Data;
        Node next_Node;

        Node(E data) {
            node_Data = data;
            next_Node = null;
        }
    }

    public void insert(E data) {

        if (this.head == null) {
            this.head  = new Node(data);
        } else {
            Node<E> last_Node = this.head;
            Node<E> new_Node = new Node(data);
            new_Node.next_Node = this.head;
            this.head = new_Node;

            while (last_Node.next_Node != null) {
                last_Node = last_Node.next_Node;
            }
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
        }


}


