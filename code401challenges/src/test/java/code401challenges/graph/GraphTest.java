package code401challenges.graph;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void addNode()
    {
        Graph test_Graph = new Graph();
        Graph.Node node = new Graph.Node<>(7);
        test_Graph.addNode(node);

        assertTrue(test_Graph.getNodes().contains(node));
    }

    @Test
    public void addEdge()
    {
        Graph test_Graph = new Graph();
        Graph.Node node_One = new Graph.Node<>(7);
        Graph.Node node_Two = new Graph.Node<>(9);

        test_Graph.addNode(node_One);
        test_Graph.addNode(node_Two);

        assertTrue(test_Graph.addEdge(node_One, node_Two, 5));
}

    @Test
    public void getNodes()
    {
        Graph test_Graph = new Graph();
        Graph.Node node_One = new Graph.Node<>(7);
        Graph.Node node_Two = new Graph.Node<>(9);

        test_Graph.addNode(node_One);
        test_Graph.addNode(node_Two);
        Set new_Set = new HashSet();
        new_Set.add(node_One);
        new_Set.add(node_Two);

        assertTrue(test_Graph.getNodes().containsAll(new_Set));
    }

    @Test
    public void getNeighbors()
    {
        Graph test_Graph = new Graph();
        Graph.Node node_One = new Graph.Node<>(7);
        Graph.Node node_Two = new Graph.Node<>(9);

        test_Graph.addNode(node_One);
        test_Graph.addNode(node_Two);

        test_Graph.addEdge(node_One, node_Two, 10);

        System.out.println(test_Graph.size());
        //assertTrue(node_One.neighbors.equals(test_Graph.getNeighbors(node_One)));
    }

    @Test
    public void size()
    {
        Graph test_Graph = new Graph();
        Graph.Node node_One = new Graph.Node<>(7);
        Graph.Node node_Two = new Graph.Node<>(9);

        test_Graph.addNode(node_One);
        test_Graph.addNode(node_Two);

        test_Graph.addEdge(node_One, node_Two, 10);

        assertTrue(2 == test_Graph.size());
    }

    @Test
    public void isEmpty()
    {
        Graph test_Graph = new Graph();
        System.out.println(test_Graph.isEmpty());
        assertTrue(test_Graph.isEmpty());
    }
}