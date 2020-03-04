package code401challenges.graph;

import java.util.*;

public class Graph<T>
{
    public class Node<T>
    {
        T node_Data;
        public List<Edge<T>> edges = new LinkedList<>();

        public Node(T node_Data) {
            this.node_Data = node_Data;
        }


        public List<Edge<T>> getEdges() {
            return edges;
        }

        public T getNode_Data()
        {
            return this.node_Data;
        }
    }

    public  class Edge<T>
    {
        public int weight;
        public Node<T> nextNode;

        public Edge(int weight, Node<T> nextNode) {
            this.weight = weight;
            this.nextNode = nextNode;
        }

    }

    ArrayList<Node<T>> vertices = new ArrayList<>();

    public Graph(){ }

    public Node<T> addNode(T node_Data)
    {
        Node<T> newNode = new Node<>(node_Data);
        vertices.add(newNode);
        return  newNode;
    }

    public void addEdge (Node<T> toNode, Node<T> fromNode, int weight)
    {
        Edge<T> newEdge = new Edge<>(weight,toNode);
        Edge<T> newEdgeTwo = new Edge<>(weight,fromNode);
        fromNode.edges.add(newEdge);
        toNode.edges.add(newEdgeTwo);
    }

    public int size(){
        return vertices.size();
    }

    public List<Node<T>> getNodes(){
        if(vertices.size() == 0){
            return null;
        }
        return new LinkedList<>(vertices);
    }

    public Map<Node<T>, Integer> getNeighbors(Node<T> node){
        Map<Node<T>, Integer> neighboringNodes = new HashMap<>();
        if(node == null || node.edges == null){
            return null;
        }
        for (Edge<T> neighbor: node.edges) {
            neighboringNodes.put(neighbor.nextNode, neighbor.weight);
        }
        return neighboringNodes;
    }


    public boolean isEmpty()
    {
        return vertices.isEmpty();
    }


    public <T> List<Node<T>> BreadthFirst(Node node)
        {
            Set<Node> visited = new HashSet<>();
            List<Node<T>> breadthFirst = new ArrayList<>();
            List<Node<T>> result = new LinkedList<Node<T>>();

            if (this.vertices.isEmpty())
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

    public String getEdge(Graph<T> graph, String[] array)
    {
        int cost = 0;
        String returnString = " ";
        boolean connection = false;
        for(int i = 0; i < array.length - 1; i++)
        {
            for(Node<T> node : graph.getNodes())
            {
                if(node.node_Data.equals(array[i]))
                {
                    for(Edge<T> edge : node.edges)
                    {
                        if (edge.nextNode.node_Data.equals(array[i + 1]))
                        {
                            cost += edge.weight;
                            connection = true;
                        } else
                            {
                            connection = false;
                        }
                    }
                }
            }
        }

        return returnString + connection + " " + cost;
    }

}