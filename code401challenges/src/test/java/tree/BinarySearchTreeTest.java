package tree;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
//Values order for testing and comparison used were sample in Baeldung.
public class BinarySearchTreeTest
{


    @Test
    public void emptyTreeTest()
    {
        BinarySearchTree expectedTree = new BinarySearchTree();
        assertTrue(expectedTree.root_Node == null);
    }

    @Test
    public void singleRootNodeTest()
    {
        BinarySearchTree expectedTree = new BinarySearchTree();
        expectedTree.add(5);
        assertEquals(5, expectedTree.root_Node.node_Data);
    }

    @Test
    public void leftAndRightChildTreeTest()
    {
        BinarySearchTree expectedTree = new BinarySearchTree();
        expectedTree.add(5);
        expectedTree.add(4);
        expectedTree.add(6);


        assertTrue(5 == (Integer)expectedTree.root_Node.node_Data);
        assertTrue(4 == (Integer)expectedTree.root_Node.left_Node.node_Data);
        assertTrue(6 == (Integer)expectedTree.root_Node.right_Node.node_Data);

    }

    @Test
    public void preOrderArrayTest()
    {
        BinarySearchTree actualTree = new BinarySearchTree();
        int[] expected = new int[]{6, 4, 3, 5, 8, 7, 9};


        actualTree.add(6);
        actualTree.add(4);
        actualTree.add(3);
        actualTree.add(5);
        actualTree.add(8);
        actualTree.add(7);
        actualTree.add(9);

        assertEquals(Arrays.toString(expected), Arrays.toString(actualTree.preOrder()));
    }

    @Test
    public void inOrderTreeTest()
    {
        BinarySearchTree actualTree = new BinarySearchTree();
        int[] expected = new int[]{3, 4, 5, 6, 7, 8, 9};

        actualTree.add(6);
        actualTree.add(4);
        actualTree.add(3);
        actualTree.add(5);
        actualTree.add(8);
        actualTree.add(7);
        actualTree.add(9);

        assertEquals(Arrays.toString(expected), Arrays.toString(actualTree.inOrder()));
    }

    @Test
    public void postOrderTreeTest()
    {
        BinarySearchTree actualTree = new BinarySearchTree();
        int[] expected = new int[]{3, 5, 4, 7, 9, 8, 6};

        actualTree.add(6);
        actualTree.add(4);
        actualTree.add(3);
        actualTree.add(5);
        actualTree.add(8);
        actualTree.add(7);
        actualTree.add(9);

        assertEquals(Arrays.toString(expected), Arrays.toString(actualTree.postOrder()));
    }

    @Test
    public void breadthFirstTest()
    {
        BinarySearchTree actual_Tree = new BinarySearchTree();
        int[] expected = new int[]{6, 4, 8, 3, 5, 7, 9};


        actual_Tree.add(6);
        actual_Tree.add(4);
        actual_Tree.add(8);
        actual_Tree.add(3);
        actual_Tree.add(5);
        actual_Tree.add(7);
        actual_Tree.add(9);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual_Tree.breadthFirst().toArray()));
    }

    @Test
    public void breadthFirstTestEmptyTree()
    {
        BinarySearchTree actual_Tree = new BinarySearchTree();


        assertEquals(null, actual_Tree.breadthFirst());
    }

    @Test
    public void findMaxTest()
    {
        BinarySearchTree actualTree = new BinarySearchTree();

        actualTree.add(6);
        actualTree.add(4);
        actualTree.add(3);
        actualTree.add(5);
        actualTree.add(8);
        actualTree.add(7);
        actualTree.add(11);

        assertEquals(11, actualTree.findMaxValue());
    }

    @Test
    public void findMaxTestRootHighestValue()
    {
        BinarySearchTree actualTree = new BinarySearchTree();

        actualTree.add(20);
        actualTree.add(4);
        actualTree.add(3);
        actualTree.add(5);
        actualTree.add(8);
        actualTree.add(7);
        actualTree.add(11);

        assertEquals(20, actualTree.findMaxValue());
    }
}