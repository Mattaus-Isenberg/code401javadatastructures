
# Animal Shelter
Implementation of a Shelter class that will adopt 2 queues, single enqueue input of Animal class with no return. Dequeue takes a single argument of prefered animal class and return is a generic for either a dog or a cat. 
## Challenge
Create 2 methods within class to queue and dequeue animals with ability to recognize input and based on input return or insert into respective queue.

## Approach & Efficiency
enqueue(Animal animal) -> takes an animal as argument, and depending on animal class forwards to respective queue.
dequeue(Class pref) -> takes an animal class preference as argument and returns a generic (cat or dog) based on input. 

## Solution
[Animal Shelter Code](src/main/java/code401challenges/src/main/java/utilities/AnimalShelter.java)
![Animal Shelter WB](assets/animal-shelter.jpg)
