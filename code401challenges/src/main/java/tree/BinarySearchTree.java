package tree;
import code401challenges.BinarySearch;
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

        while (node_Queue.peek() != null )
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





    private int findMaxValue(Node node)
    {
        //if(node.left_Node == null && node.right_Node == null)
        if(node == null)
            return 0;

        return Math.max((int)node.node_Data, Math.max(findMaxValue(node.right_Node), findMaxValue(node.left_Node)));
        //max_Value = (int)node.node_Data;
        //int left_Branch = findMaxValue(node.left_Node, max_Value);
        //int right_Branch = findMaxValue(node.right_Node, max_Value);

        //if((int)left_Branch > max_Value)
         //   max_Value =  left_Branch;

        //if((int)right_Branch > max_Value)
        //    max_Value = right_Branch;

        //return Math.max(node.value, Math.max(rightbranch, leftbranch))

       // return max_Value;
    }


    public int findMaxValue()
    {
        int max_Value = Integer.MIN_VALUE;
        return findMaxValue(this.root_Node);
    }




    private int sumOfOdds(Node root, int odd_Sum)
    {
        if(root == null)
            return odd_Sum;

        if((int)root.node_Data % 2 != 0)
        {
            odd_Sum += (int) root.node_Data;
        }

        int left_Branch = sumOfOdds(root.left_Node, odd_Sum);
        int right_Branch = sumOfOdds(root.right_Node, odd_Sum);

        if((int)left_Branch % 2 != 0)
            odd_Sum = left_Branch;

        if((int)right_Branch % 2 != 0)
            odd_Sum = right_Branch;

        return odd_Sum;
    }

    public int sumOfOdds()
    {
        int odd_Sum = 0;
        return sumOfOdds(this.root_Node, odd_Sum);
    }

    public static void main(String[] args)
    {
        BinarySearchTree test_Tree = new BinarySearchTree();
        test_Tree.add(1);
        test_Tree.add(2);
        test_Tree.add(3);
        test_Tree.add(4);
        test_Tree.add(5);
        test_Tree.add(6);
        test_Tree.add(7);
        test_Tree.add(8);
        test_Tree.add(9);


        System.out.println(test_Tree.sumOfOdds());

    }
}
