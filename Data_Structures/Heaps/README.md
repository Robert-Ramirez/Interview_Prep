# Heaps #

> A heap is a specialized binary tree. Specifically, it is a complete binary tree. The keys must satisfy the heap property: the keys at each node is at least as great as the keys stored
at its children. A max-heap can be implemented as an array; the children of the node at index i are indices 2i+1 and 2i+2. A max-heap supports O(log n) insertion, O(1) time lookup for 
the max element. The extract-max operation is defined to delete and return the maximum element. Searching for arbitrary keys has O(n) time complexity. A heap is sometimes referred to
as a priority queue because it behaves like a queue, with one difference: each element has a "priority" associated with it, and deletion removes the element with the highest priority. 
The min-heap is a complextly symmetric version of the data structure and supports O(1) times lookups for the minimum element.


Key Benefit: O(1) lookup find-max, O(log n) insertion, O(log n) deletion of max.

Node and array representations. Min-heap variant.

- Common Problems
    - Use a heap when all you care about is the largest or smallest elements, and you do not need to support fask lookup, delete, or search operations for arbitrary elements.
    - A heap is good choice when you need to compute the k largest or k smallest elements in a collection. For the former, use a min-heap, for the latter, use a max-heap.
 

- Library
    - The implementation of a heap in the Java Collection framework is referred to as a priority queue; the class is PriorityQueue.
    - Key methods
        - add()
        - peek()
        - poll()
