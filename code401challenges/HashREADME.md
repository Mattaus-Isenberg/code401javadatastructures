# Hashtables
Implementation of a Hashtable with a nested HashNode and method implementations for add, get, and contains.

## Challenge
Implement a Hashtable with the following methods:

add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
get: takes in the key and returns the value from the table.
contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
hash: takes in an arbitrary key and returns an index in the collection.

## Approach & Efficiency
Outer Hashtable class with nested HashNode class, public add, get, contains methods. Node contains 3 properties. key, value and next.

## API
add(key, value) - takes a key and value and adds to table.

get(key) - takes a key and returns the value for the key.

contains(key) - takes a key and returns a boolean if table contains the key value pair.

hash(key) - takes a key and returns a hash of the key that will always be a positive value.