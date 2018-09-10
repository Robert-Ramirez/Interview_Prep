# Arrays #

Fast access for element at an index, slow lookups (unless sorted), and insertions.

Be comfortable with notions of iterations, resizing, partitioning, merging, etc..

> The simpliest data structure is the array, which is a contiguous block of memory. 
  It is usually used to represent sequences. 
 

- Suggestions
    - Space constraints 
        - When working with an array you should take advantage of the fact that you can operate efficiently on both ends.
    - Sublter solutions 
        - Array problems often have simple brute-force solutions that use O(n) space, but there are subtler
          solotions that use the array itself to reduce space complexity to O(1).
    - Write from back 
        - Filling an array from the front is slow, so see if it's possible to write values from the back.
    - Overwriting instead of deleting
        - Instead of deleting an entry (which requires moving all entires to its left), consider overwriting it.
    - Integer encoded
        - When dealing with integers encoded by an array consider processing the digits from the back of the array.
          Alternatively, reverse the array so the least-significant digit is the first entry.
    - Subarrays
        - Be comfortable with writing code that operates on subarrays.
    - Out of Bound Exception
        - It's incredibly easy to make off-by-1 errors when operating on arrays (out of bound exception).
    - Perserving Integrity of Array
        - Don't worry about perserving the integrity of the array (sortedness, keeping the equal entries together, etc..) until it is time to return.
    - Good for fixed size input
        - An array can serve as a good data structure when you know the distribution of the elements in advance.
    - 2D array parallel logic
        - When operating on 2D arrays, use parallel logic for rows and for columns.
    - Specification
        - Sometimes it's easier to simulate the specification, than to analytically solve for the result.
     
- Library
    - [Array](https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html)
    - [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)
    - [Lists](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)
    - [Collections](https://docs.oracle.com/javase/8/docs/api/?java/util/Collections.html)

- Review
    - Don't forget the length of an array is given by the length field, unlike Collections, which uses the size() method, 
      and String, which use the length method.
    - Array class utility methods
        -  asLists()
        -  binarySearch(A, 64)
        -  copyOf(A)
        -  copyOfRange(A, 1.5)
        -  equals(A, B)
        -  fill(A, 42)
        -  sort (A)
        -  sort(A, cmp)
        -  toString()
    - Understand the variants of these methods (how to create a copy of a subarray)
    - Understand what "deep" means when checking equality of arrays, and hashing them.
         

- Complexity Overview  
    - Retrieving and updating A[i] takes O(1) times.
    - Insertion (O(n)): 
        - Into a full array can be handled by resizing, i.e., allocating a new array with additional memory
          memory and copying over the entries from the original array. 
    - Deleting (O(n)): 
        - an element from an array entails moving all successive elements one over to the left to fill the void.     