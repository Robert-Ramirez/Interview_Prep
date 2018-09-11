# Binary Search Trees #

>  Adding and deleting elements to an array is computationally expensive, when the array needs to stay sorted. BSTs are similar to arrays in that the stored values (the
   "keys") are stored in a sorted order. BSTs offer the ability to search for a key as well as find the min and max elements, look for the successor or predecessor of a search key
   (which itself need not be present in the BST), and enumerate the keys in a range in sorted order. However, unlike with a sorted array, keys can be added to and deleted from a BST efficiently.
   A BST is a binary tree as defined in Chapter 10 in which the nodes store keys that are comparable, e.g., integers or strings. The keys stored at nodes have to respect the BST property—the 
   key stored at a node is greater than or equal to the keys stored at the nodes of its left subtree and less than or equal to the keys stored in the nodes of its right subtree. 
   Key lookup, insertion, and deletion take time proportional to the height of the tree, which can in worst-case be O(n),if insertions and deletions are naively implemented.
   However, there are implementations of insert and delete which guarantee that the tree has height O(log n). These require storing and updating additional data at the tree nodes. 
   Red-black trees are an example of height-balanced BSTs and are widely used in data structure libraries.
   A common mistake with BSTs is that an object that's present in a BST is to be updated. The consequence is that a lookup for that object will now fail, even though it's still in the BST.
   When a mutable object that's in a BST is to be updated, first remove it from the tree, then update it, then add it back. (As a rule, avoid putting mutable objects in a BST.)
   Searching is the single most fundamental application of BSTs. Unlike a hash table, a BST offers the ability to find the min and max elements, and find the next largest/next smallest element. 
   These operations, along with lookup, delete and find, take time O(log n) for library implementations of BSTs. Both BSTs and hash tables use O(n) space—in practice, a BST uses slightly more space.


Key Benefit: O(log n) insertions, deletions, lookups, find-min, find-max, successors,
predecessor when tree is height-balanced. 

Understand node fields, pointer implmentation. Be familiar with notion of balance and operations
maintaining balance.

- Library
    - There are two BST-based data structures commonly used in Java—TreeSet and TreeMap. The former implements the Set interface, and the latter implements the Map interface—refer to 210 for a review of the Set and Map functionality. 
    - The sortedness of the keys in a BST meansthatTreeSet and TreeMap have functionality beyond that specified by Set and textttMap. 
    - First,wedescribe the functionalities added by TreeSet.
    - The iterator returned by iteratorO traverses keys in ascending order. (To iterate over keys in descending order, use descendinglteratorO.)
    - Key Methods


- Common Problems
    - With a BST you can iterate through elements in sorted order in time 0(n) (regardless of whether it is balanced).
    - Some problems need a combination of a BST and a hashtable. For example, if you insert student objects into a BST and entries are ordered by GPA, and then a student's GPA needs to be updated and all we have is the student's name and new GPA, 
      we cannot find the student by name without a full traversal. However, with an additional hash table, we can directly go to the corresponding entry in the tree. 
    - Sometimes, it's necessary to augment a BST, e.g., the number of nodes at a subtree in addition to its key, or the range of values sorted in the subtree. 
    - The BST property is a global property a binary tree may have the property that each node's key is greater than the key at its left child and smaller than the key at its right child, but it may not be a BST.