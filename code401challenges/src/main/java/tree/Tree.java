package tree;

import java.util.ArrayList;

public class Tree
{
    Node root_Node;

    private ArrayList<Integer> preOrder(Node node, ArrayList<Integer> array)
    {
        if(node == null)
            return array;

        array.add(node.node_Data);
        preOrder(node.left_Node, array);
        preOrder(node.right_Node, array);

        return array;
    }

    public Object[] preOrder()
    {
        ArrayList<Integer> return_Array = new ArrayList<Integer>();
        return preOrder(this.root_Node, return_Array).toArray();
    }

    private ArrayList<Integer> inOrder(Node node, ArrayList<Integer> array)
    {
        if(node == null)
            return null;

        inOrder(node.left_Node, array);
        array.add(node.node_Data);
        inOrder(node.right_Node, array);

        return array;
    }

    public Object[] inOrder()
    {
        ArrayList<Integer> return_Array = new ArrayList<Integer>();
        return inOrder(this.root_Node, return_Array).toArray();
    }

    private ArrayList<Integer> postOrder(Node node, ArrayList<Integer> array)
    {
        if(node == null)
            return null;

        postOrder(node.left_Node, array);
        postOrder(node.right_Node, array);

        array.add(node.node_Data);

        return array;
    }

    public Object[] postOrder()
    {
        ArrayList<Integer> return_Array = new ArrayList<Integer>();
        return postOrder(this.root_Node, return_Array).toArray();
    }
}
