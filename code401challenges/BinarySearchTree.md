


# Binary Search Tree
Development of Node, Tree, and BinarySearchTree Classes
Binary search tree will add values properly and into respective expected side of the tree taking root value as determinant.

## Challenge
Create 3 classes

Node - provides initial structure for the BinarySearchTree to implement. Aware of left, and right nodes, as well as its data.

Tree - provides class that implements root_Node as well as a preOder(), inOrder, and postOrder() methods that will return arrays with data sorted in expected order of each. This class is also the superClass for the BinarySearchTree class.

BinarySearchTree - Provides a method for adding values add() as well as to determine if a value is part of the tree contains(), one to return a list of the values in a tree by row called breadthFirst(), and a method called findMaxValue() that returns the max value contained within the tree.



## Approach & Efficiency

Node O-1

Tree O-1

BinarySearchTree O-1

## CODE
[All classes](/code401challenges/src/main/java/tree/)

## WB 
![findMaxValue WB](/assets/findMaxValue.jpg)
![Breadth First WB](/assets/breadthfirst.jpg)

## API
Node implements a left_Node, right_Node and a node_Data properties.

Tree implements:

root_Node -> Root node property for Binary Search tree to make use of as well as for itself in ordering methods.

preOrder() -> returns an array with the data contained in the tree properly formatted for expected output.

inOrder() -> returns an array with the data contained in the tree properly formatted for expected output.

postOrder() -> returns an array with the data contained in the tree properly formatted for expected output.

BinarySearchTree implements:

add(data) -> adds a new node with passed in data on respective side of the tree as expected by its value in contrast with root_Node.

contains(data) -> returns a boolean identifying if the passed in argument is contained within the tree as a value.


enqueue(E data) -> adds a new node with passed in data from the front of the Queue.

dequeue() -> making use of recursion removes the last node and returns the nodes data. 

breadthFirst() -> makes use of a while loop to return a list of the values in the tree by row.

findMaxValue() -> Makes use of recursion and returns the max value held within the tree, takings no arguments.