package tree;

import java.util.ArrayList;

public class Tree<E>
{
    Node<E> root_Node;

    private ArrayList<Integer> preOrder(Node<E> node, ArrayList<Integer> array)
    {
        if(node == null)
            return array;

        array.add((Integer) node.node_Data);
        preOrder(node.left_Node, array);
        preOrder(node.right_Node, array);

        return array;
    }

    public Integer[] preOrder()
    {
        ArrayList<E> return_Array = new ArrayList<>();
        return preOrder(this.root_Node, (ArrayList<Integer>) return_Array).toArray(new Integer[return_Array.size()]);
    }

    private ArrayList<Integer> inOrder(Node node, ArrayList<Integer> array)
    {
        if(node == null)
            return null;

        inOrder(node.left_Node, array);
        array.add((Integer)node.node_Data);
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

        array.add((Integer) node.node_Data);

        return array;
    }

    public Object[] postOrder()
    {
        ArrayList<Integer> return_Array = new ArrayList<Integer>();
        return postOrder(this.root_Node, return_Array).toArray();
    }

    public Node<E> getRoot_Node()
    {
        return root_Node;
    }

    public void setRoot(Node root) {
        this.root_Node = root;
    }
}
