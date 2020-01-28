package utilities;
import org.junit.Before;
import org.junit.Test;
import tree.*;


import static org.junit.Assert.*;

public class FizzBuzzTreeTest
{
    BinarySearchTree<Object> inputTree;

    @Before
    public void setup()
    {
        inputTree = new BinarySearchTree<>();
        inputTree.add(5);
        inputTree.add(15);
        inputTree.add(20);
        inputTree.add(1);
        inputTree.add(12);
        inputTree.add(27);
        inputTree.add(57);

        inputTree.preOrder();
    }

    @Test
    public void fizzBuzzTree()
    {
        Tree actual_Tree = FizzBuzzTree.FizzBuzzTree(inputTree);

        assertEquals("Buzz", actual_Tree.getRoot_Node().node_Data);
        assertEquals("FizzBuzz", actual_Tree.getRoot_Node().right_Node.node_Data);
        assertEquals(1,actual_Tree.getRoot_Node().left_Node.node_Data);
        assertEquals("Fizz",actual_Tree.getRoot_Node().right_Node.left_Node.node_Data);
        assertEquals("Buzz",actual_Tree.getRoot_Node().right_Node.right_Node.node_Data);
        assertEquals("Fizz",actual_Tree.getRoot_Node().right_Node.right_Node.right_Node.right_Node.node_Data);
        assertEquals("Fizz",actual_Tree.getRoot_Node().right_Node.right_Node.right_Node.node_Data);
    }

}