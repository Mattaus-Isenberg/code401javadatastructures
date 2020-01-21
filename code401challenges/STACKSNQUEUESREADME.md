# Stacks and Queues
Development of a Stack and Queue class
Stack will push values on top always and pop values from top as well.
Queues will enqueue from back and dequeue from the front.

## Challenge
Create 4 classes
Node - provides initial structure for the stack and queue class to implement. Aware of next node and its data.
Stack - provides a for a structure that will always push and pop values from the top.
Queue - Provides a data structure that enqueues values from the back and dequeues from the front.
PseudoQueue - provides a data structure that uses a Stack underneath with queue methods to operate it, enqueue pushes into top, dequeue pops from bottom.
## Approach & Efficiency
All 4 classes implement generics for versatility.

Node O-1

Stacks O-1

Queues O-1

PseudoQueue

## CODE
[Code for all classes](code401challenges/src/main/java/stacksandqueues)

## API
Node implements a next_Node and a node_Data properties.

Stacks implements:

push(E data) -> pushes a new node with data in argument to top of Stack.

pop() -> removes the node at the top returning the value in it, takes no argument, returns the value.

peek() -> returns the value of the top node without modifying the Stack.

isEmpty() -> returns a boolean indicating if the Stack is empty or not. 

Queue implements:

enqueue(E data) -> adds a new node with passed in data from the back of the Queue, always being the last node on it.

dequeue() -> removes the node at the front of the queue returning its value.

peek() -> returns the value of the front node without modifying the Queue.

isEmpty -> returns a boolean indicating if the Queue is empty of not.

PseudoQueue implements:

enqueue(E data) -> adds a new node with passed in data from the front of the Queue.

dequeue() -> making use of recurssion removes the last node and returns the nodes data. 
