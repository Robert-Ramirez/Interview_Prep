# Hash Tables #

> A hash table is a data structure used to store keys, optionally, with corresponding values. Insert, deletes, and lookups run in O(1) time on average.
 The underlying idea is to store keys in an array. A key is stored in the array locations ("slots") based on its "hash code". The hash code is an integer 
 computed from the keys by a hash function. If the hash function is chosen well, the objects are distributed uniformly across the array locations. If two
 keys map to the same location, a "collision" is said to occur. The standard mechanism to deal with collision is to maintian a linked list of objects at each 
 array location. If the hash function average, lookups, insertions, and deletions are O(1 + n/m) time complexity, where n is the number of objects and 
 m is the length of the array. If the "load" n/m grows large, rehashing can be applied to the hash table. A new array with a larger number of locations is
 allocated, and the objects are moved to the new array. Rehashing is expensive (O(n+m)time) but if it is done infrequently its amortized cost is low. Compared to
 binary search tree insertig and deleting in a hash table is more efficient (assuming rehashing is infrequent). One disadvantage of hash table is the need for a 
 good hash function but this is rarely an issue in practice. Similarly, rehashing is not a problem outside of realtime systems and even for such systems, a 
 seperate thread can do the rehashing. A hash function has one hard requirement - equal keys should have equal hash codes. This may seem obvious, but it is easy
 to get wrong (by writing a fash function that is based on address rather than contents or by including profiling data). A soft requirement -  is that the hash 
 function should "spread" keys (the hash code for a subset of objects should be unifromly distributed across the underlying array). In addition, a hash function should 
 be efficient to compute. A common mistake with hash tables is that a key that's present in a hash table will be updated. The consequence is that a lookup for the key will
 now fail, even though it's still in the hash table. If you have to update a key, first remove it, then update it, and finally add it back - this ensures it's moved to 
 the correct array location. As a rule, you should avoid using mutable objects as keys. A hash table is a good data structure to represent a dictionary (a set of strings).
 In some applications, a trie, which is a tree data structure that is used to store a dynamic set of strings, has computational advantages. Unlike a BST, nodes in the tree
 do not store a key. Instead, the node's position in the tree defines the key which it is associated with.


Understand implmentation using array of buckets and collision chains. 

Know hash functions for integers, string, objects. 
Key Benefit: O(1) insertions, deletions, and lookups. 

- Key Disadvantages 
   - Not suitable for order-related queries 
   - Need for resizing 
   - Poor worst-case performance 
 
- Common Problems
   - Hash Tables have the best theoretical and real-world performance for lookup, insert, and delete. Each of these operations has O(1) time complexity. The O(1) times complexity
     for insertion is the average case - a single insert can take O(n) if the hash table has to be resized.
   - Consider using a hash code as a signature to enhance performance (to filter out candidates).
   - Consider using a precomputed lookup table instead of a boilerplace if-then code for mappings (from chracter to value or chracter to character)
     When defining your own type that will be put in a hash table, be sure you understand the relationship between logical equality and the fields the hash function must inspect.
   - Specifically, anytime equality is implemented, it is imperative that the correct hash function is also implemented, otherwise when objects are placed in the hash table, logically
     equivalent objects may appear in different buckets, leading to lookups returning false, even when the searched items is present.
   - Sometimes you'll need a multimap, i.e., a map that contains multiple values for a single keys, or a bi-directional map. If the language's standard libraries do not provide the functionality
     you need, learn how to implement a multimap using lists as values, or find a third party library that has a multimap.

- Library
  - There are two hash table-based data structures commonly used in Java
     - HashSet
     - HashMap
  - The difference between the two is that the latter stores key-value pairs, whereas the former simply stores keys. Both have the property that they do not 
    allow for duplicate keys, unlike LinkedList and PriorityQueue. Technically, HashSet implements the Set interface, and HashMap implements the Map interface.
  - Key Methods for HashSet defined in Set
         - add()
         - remove()
         - contains()
         - iterator()
         - isEmpty()
         - size()
         - Both add and remove return a Booleanindicating if the added/removed element was already present. 
         - It's is important to remember that null is a valid entry.
                  - The order in which keys are traversed by the iterator returned by the iterator() is unspecified; it may even change with time. 
                    The class LinkedHashSet subclasses HashSet - the only difference is that iterator() return keys in the order in which they were
                    inserted into the set. This order is not affected if an element is re-inserted into the set (if s.add(x) is called when s.contains(x) is true).
                  - HashSet implements retainAll(C), which can be used to perform set intersectin - this can be used to reduce coding burden substantially in some cases.
                    A related method is removeAll(C).
  - Key Methods for HashMap defined in Map
         - put("z",26)
         - get("Hardy")
         - remove("z")
         - containsKey("Hardy")
         
