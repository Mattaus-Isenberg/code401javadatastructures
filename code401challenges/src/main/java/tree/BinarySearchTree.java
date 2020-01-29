package tree;
import stacksandqueues.Queue;

import java.util.ArrayList;


public class BinarySearchTree<E> extends Tree
{

    private Node add(Node node, int data)
    {
        if(node == null)
        {
            node = new Node(data);
        }

        if(data < (Integer)node.node_Data)
            node.left_Node = add(node.left_Node, data);

        if(data > (Integer) node.node_Data)
            node.right_Node = add(node.right_Node, data);

        return node;
    }

    public void add(int data)
    {
        root_Node = add(root_Node, data);
    }



    private boolean contains(Node node, int data)
    {
            if (node == null)
                return false;

            if ((Integer)node.node_Data == data)
                return true;

            return data < (Integer)root_Node.node_Data ? contains(node.left_Node, data) : contains(node.right_Node, data);
    }

    public boolean contains(int data)
    {
        return contains(root_Node, data);
    }

    private ArrayList<Integer> breadthFirst(Node node, ArrayList<Integer> list)
    {
        if(node == null)
            return null;


        Queue<Node> node_Queue = new Queue<>();
        node_Queue.enqueue(node);

        while (node_Queue.peek() != null)
        {
            Node holder = node_Queue.dequeue();

            list.add((Integer)holder.node_Data);

            if(node.left_Node != null)
                node_Queue.enqueue(holder.left_Node);


            if(node.right_Node != null)
                node_Queue.enqueue(holder.right_Node);

        }
        return list;
    }

    public ArrayList<Integer> breadthFirst()
    {
        ArrayList<Integer> returned_List = new ArrayList<>();
        return breadthFirst(this.root_Node, returned_List);
    }

}
