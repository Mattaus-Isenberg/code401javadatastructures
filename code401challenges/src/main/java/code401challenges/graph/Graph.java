package code401challenges.graph;

import java.util.*;

public class Graph<T>
{
    public static class Node<T>
    {
        T node_Data;
        List<Edge<T>> neighbors;

        public Node()
        {
            this.neighbors = new LinkedList<>();
        }

        //overloaded for node data inclusion
        public Node(T node_Data)
        {
            this.node_Data = node_Data;
            this.neighbors = new LinkedList<>();
        }

        public boolean addEdge(Node<T> neighbor, Integer weight)
        {
            Edge<T> edge = new Edge(neighbor, weight);
            return neighbors.add(edge);
        }

        public T getNode_Data()
        {
            return this.node_Data;
        }
    }

    public static class Edge<T>
    {
        public Node<T> getNeighbor() {
            return neighbor;
        }

        public Node<T> neighbor;

        public Integer getWeight() {
            return weight;
        }

        Integer weight;

        public Edge(Node<T> neighbor, Integer weight)
        {
            this.neighbor = neighbor;
            this.weight = weight;
        }

    }

    public Set<Node<T>> graph;

    public Graph()
    {
        this.graph = new HashSet<>();
    }

    public boolean addNode(Node<T> node)
    {
        return graph.add(node);
    }

    public boolean addEdge(Node<T> node_One, Node<T> node_Two, Integer weight)
    {
        Node test_One = node_One;
        Node test_Two = node_Two;
        Set node_Check = new HashSet<>();
        node_Check.add(test_One);
        node_Check.add(test_Two);

        if(!graph.containsAll(node_Check))
        {
           return false;
        }
        node_One.addEdge(node_Two, weight);
        node_Two.addEdge(node_One, weight);
        return true;
    }

    public Set getNodes()
    {
        return this.graph;
    }

    public List<Edge<T>> getNeighbors(Node<T> node)
    {
        if(graph.contains(node))
        {
            return node.neighbors;
        }
        return new LinkedList<>();
    }

    public int size()
    {
        return graph.size();
    }

    public boolean isEmpty()
    {
        return graph.isEmpty();
    }


    public <T> List<Node<T>> BreadthFirst(Node node)
        {
            Set<Node> visited = new HashSet<>();
            List<Node<T>> breadthFirst = new ArrayList<>();
            List<Node<T>> result = new LinkedList<Node<T>>();

            if (this.graph.isEmpty())
            {
                return result;
            }

            visited.add(node);
            result.add(node);
            breadthFirst.add(node);
            while (!result.isEmpty())
            {
                result.remove(node);
                if (!visited.contains(node))
                {
                    breadthFirst.add(node);
                }
                visited.add(node);
                getNodes().forEach(neighbor -> {
                    if (!visited.contains(neighbor))
                    {
                        result.add((Node<T>) neighbor);
                    }
                });
            }
            return breadthFirst;
    }

}