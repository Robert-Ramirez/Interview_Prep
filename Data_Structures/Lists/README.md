# Lists #

> A list implements an ordered collection of values, which may include reptitions. Specifically, a singly linked list is a data structure that contains a 
  sequence of nodes such that each node contains an object and a reference to the next node in the list. The first node is referred to as the head and the last
  node is referred to as the tail; the tail's next field is null. Lists are usually building blocks of more complex data structures. 

Be comfortable with iteration, insertion, and deletion within singly and doubly linked list.

- Understand trade-offs with respect to arrays.
    - The key differences are:
        - Inserting and deleting elements in a list has time complexity O(1)
        - Obtaining the kth element in a list is expensive, O(n) time complexity.

- Common Problems
    - Lists problems often have a simple brute-force solutions that uses O(n) space, but a subtler solution that uses the exisiting list nodes to reduce space complexity to O(1).
    - Very often, a problem on lists is conceptually simple, and is more about cleanly coding what's specified, rather than designing an algorithm.
    - Consider using a dummy head (sometimes referred to as a sentinel) to avoid having check for empty lists. This simplifies code, and makes bugs less likley.
    - It's easy to forget to update next (and previous for double linked list) for the head and tail.
    - Algorithms operating on singly linked lists often benefit from using two iterators, one ahead of the other, or one advancing quicker than the other.

- Review
    -  There are two types of list-related problems:
        -  those where you have to implement your own list
        -  those where you have to exploit the standard list library

- Time Complexity
    - Insert and Delete are local operations and have O(1) time complexity. 
    - Search requires traversing the entire list, if the key is at the last node or is absent, so its time complexity is O(n), where n is the number of nodes.

- Practice Code:
    - [X] [singlyLinkedList](Code/EPI/singlyLinkedList.java)            