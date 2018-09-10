# Lists #

Understand trade-offs with respect to arrays. 

Be comfortable with iteration, insertion, and deletion within singly and doubly linked list.

Know how to implment a list with dynamic allocation and with arrays.


> A list implements an ordered collection of values, which may include reptitions. Specifically, a singly linked list is a data structure that contains a 
  sequence of nodes such that each node contains an object and a reference to the next node in the list. The first node is referred to as the head and the last
  node is referred to as the tail; the tail's next field is null. 

A list is similiar to an array in that it contains objects in a linear order. 

- The key differences are:
    - Inserting and deleting elements in a list has time complexity O(1)
    - obtaining the kth element in a list is expensive, O(n) time complexity.

Lists are usually building blocks of more complex data structures. 

- Review
    -  There are two types of list-related problems:
        -  those where you have to implement your own list
        -  those where you have to exploit the standard list library

- Practice Code:
    - [X] [singlyLinkedList](Code/EPI/singlyLinkedList.java)            