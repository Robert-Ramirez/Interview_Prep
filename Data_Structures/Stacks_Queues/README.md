# Stack and Queues #

> Stacks support last-in, first-out (LIFO) for insert and deletes, where queues are first-in, first-out (FIFO). Stacks and queues are usually building blocks
  in a solution to a complex problem. They can also make for stand-alone problems.
  
Stack:
> A stack support two basic operations - push and pop. Elements are added (pushed) and removed (popped) in last-in, first-out (LIFO) order. If the stack is empty,
  pop typically returns null or throws an exception. When the stack is implmeneted using a linked list these operations have O(1) time complexity. If it is implemented 
  using an array, there is a maximum number of entries it can have - push and pop are still O(1).  If the array is dynamically resized, the amortized time for both push
  and pop is O(1). A stack can support additional operations such as peek, which returns the top of the stack without popping it.
  

Recognize where last-in first-out (stack) and first-in first-out (queue) semantics are applicable.

Know array and linked list implementations.

- Common Problems
    - Learn to recognize when the stack LIFO property is applicable. For example, parsing typically benefits from a stack.
    - Consider augmenting the basic stack or queue data structure to support additional operations, such as finding the maximum element.