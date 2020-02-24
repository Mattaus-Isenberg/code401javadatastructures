package code401challenges;

import stacksandqueues.Node;
import stacksandqueues.Stack;
import tree.BinarySearchTree;
import tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TreeIntersection
{
//    Code Challenge
//    Find common values in 2 binary trees.
//
//    Specifications
//    Read all of the following instructions carefully. Name things exactly as described.
//    Do all your work in a public repository (matching the example provided by your instructor) called data-structures-and-algorithms, with a well-formatted, detailed top-level README.md
//    Create a branch in your repository called tree-intersection
//    On your branch, create…
//    C#: create a method named TreeIntersection outside of Main() in your Program.cs file. Call Your newly created method in Main() once complete.
//    JavaScript: a folder named treeIntersection which contains a file called tree-intersection.js
//    Python: a folder named tree_intersection which contains a file called tree_intersection.py
//    Java: a folder named TreeIntersection which contains a file called TreeIntersection.java
//    Include any language-specific configuration files required for this challenge to become an individual component, module, library, etc.
//    NOTE: You can find an example of this configuration for your course in your class lecture repository.
//    Feature Tasks
//    Write a function called tree_intersection that takes two binary tree parameters.
//    Without utilizing any of the built-in library methods available to your language, return a set of values found in both trees.
//    Structure and Testing
//    Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition.
//
//    Write at least three test assertions for each method that you define.
//
//    Ensure your tests are passing before you submit your solution.

    public boolean someMethod(){return true;}

    public ArrayList<Integer> compare(BinarySearchTree one, BinarySearchTree two)
    {
        ArrayList<Integer> sameValues = new ArrayList<>();
        Stack<Node> myStack = new Stack<>();
        HashSet<Integer> seeNums = new HashSet<>();

        myStack.push(one.getRoot_Node());

        while (!myStack.isEmpty())
        {
            Node temp = myStack.pop();
            seeNums.add(temp.node_Data);
            if(temp.left != null)
            {
                myStack.push(temp.left);
            }
            if(temp.right != null)
            {
                myStack.push(temp.right);
            }
        }

        myStack.push(two.getRoot_Node());

        while (!myStack.isEmpty())
        {
            Node temp = myStack.pop();
            if(seeNums.contains(temp.value))
            {
                sameValues.add(temp.value)
            }
            if(temp.left != null)
            {
                myStack.push(temp.left);
            }
            if(temp.right != null)
            {
                myStack.push(temp.right);
            }
        }

        return  sameValues;
    }
}
