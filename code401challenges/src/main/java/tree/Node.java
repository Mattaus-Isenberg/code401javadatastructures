package tree;

public class Node<E>
{
        public E node_Data;
        public Node<E> left_Node;
        public Node<E> right_Node;

        public Node(E data)
        {
            this(data, null, null);
        }

        Node(E data, Node left, Node right)
        {
            this.node_Data = data;
            this.left_Node = left;
            this.right_Node = right;
        }
}


