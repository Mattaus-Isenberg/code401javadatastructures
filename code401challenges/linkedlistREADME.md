# Singly Linked List
Creation of a Linked list that supports node objects of any value type, supporting insertion, search, and printing of values

## Challenge
Create LinkedList class with nested Node class, method to insert, method to print values, method to search if value is contained in list.

## Approach & Efficiency
Created nested Node class within LinkedList, accepted values are generic to allow for any value type to be contained

## API
[LinkedList Code](src/main/java/linkedList/LinkedList.java)

insert(value) -> Allows for the insertion of a node of any type into the linked list

includes(value) -> Searches across the linked list for the value in the argument, returns true if contained, false if not.

toString() -> Returns the string representation of the contents of the linked list.

append(value) -> Adds node with value as data to the end of the list.

insertBefore(value, newValue) -> Adds a node with newValue as its data before the node containing value.

insertAfter(value, newValue) -> Adds a node with newValue as its value after the node containing value as its data.

![LinkedList Board](assets/ll-Board.jpg)
![LinkedList Algorithm](assets/ll-algorithm.jpg)
