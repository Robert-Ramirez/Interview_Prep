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

- Library 
    - Preferred way to represent a stack in java is via the Deque interface. The ArrayDeque class is a resizable array that implements the interface, and provides
      O(1) amortized time stack (and queue) functionality. It is very efficient, and its used is considered best practice.
    - Key Methods in Deque interface
        - push(e)
            - Pushes an element onto the stack. Not much can go wrong with a call to push. Some implmementation classes may throw IllegalStateException if the capacity limit is exceded or a 
              NullPointerException if the element being inserted is null. LinkedList has no capacity limit and allows for null entries (be careful when adding null).
        - peek()
            - Retrieve, but does not remove the element at the top of the stack. If the stack is empty, it returns null. Since null may be a valid entry, this leads to
              ambiguity. Therefore better test for an empty stack is isEmpty().
        - pop()
            - will remove and return the element at the top of the stack. It throws NoSuchElementException if the deque is empty. To avoid the exception, first test with isEmpty().
    - Key Methods in Deque methods
        - addFirst(e)
        - peekFirst()
        - removeFirst()
    - Other useful stack-related methods are:
        - descendingIterator()
        - iterator()
    
Queue:

> A queue support two basic operations - enqueue and dequeue. Elements are added (enqueue) and removed (dequeue) in first-in, first-out (FIFO) order. If the queue is empty,
  dequeue typically returns null or throws an exception. When the queue is implmeneted using a linked list these operations have O(1) time complexity. If it is implemented 
  using an array, there is a maximum number of entries it can have - enqueue and dequeue are still O(1).  If the array is dynamically resized, the amortized time for both enqueue
  and dequeue is O(1). A queue can support additional operations such as max-method, which returns the maximum element stored in the queue.
  
  
- Common Problems
    - Learn to recognize when the queue FIFO property is applicable. For example, queues are ideal when order needs to be preserved.
    

- Library 
    - The preferred way to manipulate queues is via the Deque interface. The ArrayDeque class is resizable array that implements this interface, and provides O(1) amortized 
      time queue (and stack) functionality. It is very efficient and is considered best practice.
    - Key queue-related Methods
        - addLast()
            - Enqueue an element. Some class implementing Deque have capacity limits and/or precludes null from being enqueued, but this is not the case for LinkedList. 
        - removeFirst()
            -  retrieves and removes the first element of this deque, throwing NoSuchElementException if the deque is empty   
        - getFirst()
            - retrieves, but does not remove, the first element of the deque, throwing NoSuchElementException if the deque is empty.    
        - The methods below are very similiar to addLast(), removeFirst(), and getFirst(), the exception is being that they are less prone to throwing exception.
        - offerLast()
        - pollFirst()
        - peekFirst()
        - Other useful queue-related methods are 
            - descendingIterator()
            - iterator()
    - Deque is a subinterface of Queue.  
             
        