package utilities;
import org.junit.Before;
import org.junit.Test;
import tree.*;


import static org.junit.Assert.*;

public class FizzBuzzTreeTest
{
    BinarySearchTree<Object> input_Tree;

    @Before
    public void setup()
    {
        input_Tree = new BinarySearchTree<>();
        input_Tree.add(5);
        input_Tree.add(15);
        input_Tree.add(20);
        input_Tree.add(1);
        input_Tree.add(12);
        input_Tree.add(27);
        input_Tree.add(57);

        input_Tree.preOrder();
    }

    @Test
    public void fizzBuzzTree()
    {
        Tree actual_Tree = FizzBuzzTree.FizzBuzzTree(input_Tree);

        assertEquals("Buzz", actual_Tree.getRoot_Node().node_Data);
        assertEquals("FizzBuzz", actual_Tree.getRoot_Node().right_Node.node_Data);
        assertEquals(1,actual_Tree.getRoot_Node().left_Node.node_Data);
        assertEquals("Fizz",actual_Tree.getRoot_Node().right_Node.left_Node.node_Data);
        assertEquals("Buzz",actual_Tree.getRoot_Node().right_Node.right_Node.node_Data);
        assertEquals("Fizz",actual_Tree.getRoot_Node().right_Node.right_Node.right_Node.right_Node.node_Data);
        assertEquals("Fizz",actual_Tree.getRoot_Node().right_Node.right_Node.right_Node.node_Data);
    }

}