package stacksandqueues;



class Node<E>
{
    public E node_Data;
    public Node next_Node;

    Node(E data)
    {
        this(data, null);
    }

    Node(E data, Node next)
    {
        node_Data = data;
        next_Node = next;
    }
}
