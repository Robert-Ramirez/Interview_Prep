# Binary Trees #

> Formally, a binary tree is either empty or a root node r together with a left binary tree and a right binary tree. The subtrees themselves are binary trees. 
  The left binary tree is sometime referred to as the left subtree of the root and the right binary is referred to as the right subtree of the root.
  Binary Trees most commonly occur in the context of binary search trees, wherein keys are stored in a sorted fashion. However, there are many other application of binary trees:
  at a high-level, binary tree are appropriate when dealing with hierarchies. 

Parent-Child

> The parent-child relationship defines an ancestor-descendant relationship on nodes in a binary tree. A node that has no descendants except itself is called a leaf.

Depth
> The depth of a node n is the number of nodes on each path from the root to n, not including n itself. The height of a binary tree is the maximum depth of any node in that tree.
  A level of a tree is all nodes at the same depth. 
  
Full Binary Tree
> A full binary tree is a binary in which every node other than the leaves has two children. A perfect binary tree is a full binary tree in which all leaves are at the same depth, 
and in which every parent has two children. A complete binary tree is a binary tree in which every level, except possibly the last, is completely filled, and all the nodes are far left 
as possible. A complete binary tree on n nodes has a height of log n.

Skewed Binary Trees
> A left-skewed binary tree is a tree in which no node has a right child; a right-skewed binary tree is a tree which no node has a left child. In either case, we refer to the binary tree
being skewed.

Traversal
> Key Computation on a binary tree is traversing all the nodes in the tree. preorder (Root, Left, Right), inorder (Left, Root, Right), and postorder (Left, Right, Root) traversals.

Key Benefit: Use for representing hierarchical data.

Know about depth, height, leaves, search path, traversal sequences, successors/predecessor operations.


- Common Problems
    - Recursive problems are well-suited to problems on trees. Remember to include space implicitly allocated on the function call stack when doing space complexity analysis.
    - Some tree problems have simple brute-force solutions that use O(n) space, but subtler solutions that use the exsisting tree nodes to reduce space complexity to O(1).
    - Consider left-skewed and right-skewed trees when doing complexity analysis. Note that O(h) complexity, where h is the tree height, translates into O(log n) complexity for balanced trees, but O(n) for skewed trees.
    - If each node has a parent field, use it to make your code simpler, and to reduce time and space complexity.
    - It's easy to make the mistake of treating a node that has a single child as a leaf.