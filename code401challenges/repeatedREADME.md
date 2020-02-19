# RepeatedWords
Find the first repeated word in a book.

## Challenge
Write a function that accepts a lengthy string parameter.
Without utilizing any of the built-in library methods available to your language,
return the first word to occur more than once in that provided string.

## Approach & Efficiency
Makes use of Regex to eliminate spaced and commas then normalizes values to lower case and finally makes use of HashTable to obtain unique values, returning first repeated instance.

## API
repeatedWord() - takes in a sentence or paragraph, removes white space before or after as well as commas, stores words in array, sorts through them, normalizes to lower case and finally adds unique values to hash table returning first re-occuring value.

##CODE
[Code](code401challenges/src/main/java/repeatedword/RepeatedWord.java)