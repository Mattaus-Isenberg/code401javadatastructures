package stacksandqueues;

public class Node<E>
{
    public E node_Data;
    public Node next_Node;


    Node(E data)
    {
        this(data, null);
    }

    Node(E data, Node next_Node)
    {
        this.node_Data = data;
        this.next_Node = next_Node;
    }
}


