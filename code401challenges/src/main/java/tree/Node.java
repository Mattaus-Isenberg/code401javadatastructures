package tree;

public class Node
{
        public int node_Data;
        public Node left_Node;
        public Node right_Node;

        Node(int data)
        {
            this(data, null, null);
        }

        Node(int data, Node left, Node right)
        {
            this.node_Data = data;
            this.left_Node = left;
            this.right_Node = right;
        }
}


