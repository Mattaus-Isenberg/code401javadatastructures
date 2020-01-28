package tree;

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



}
