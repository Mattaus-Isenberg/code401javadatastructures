package utilities;

import tree.*;


public class FizzBuzzTree<E>
{


    private static void FizzBuzzTree(Node<Object> node)
    {
        if(node != null)
        {
            FizzBuzzTree(node.left_Node);
            FizzBuzzTree(node.right_Node);

            if ((Integer)node.node_Data % 15 == 0)
            {
                node.node_Data = "FizzBuzz";
            }
            else if ((Integer) node.node_Data % 5 == 0)
            {
                node.node_Data = "Buzz";
            }
            else if ((Integer) node.node_Data % 3 == 0)
            {
                node.node_Data = "Fizz";
            }
        }
    }

    public static Tree<Object>FizzBuzzTree(Tree<Object> tree)
    {
        FizzBuzzTree(tree.getRoot_Node());
        return tree;

    }

}

