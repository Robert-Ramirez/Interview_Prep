# Best Practice for Interview Code #

Practices used for Interview that are not suitable for production code (due to finite time constraints). 

- Interview Coding Format:
    - Make fields public, rather than use getters and setters.
    - Do not protect against invalid inputs.
    - Occasionally use static fields to pass values (reduces need for the number of classes at the cost of losing thread safety).
    - Short identifiers (q instead of queue).
    - follow google java style guide (naming and spacing conventions).
    - Spending time making sure the program works over prioritizing specific types.
    - Do not provide a generic solution when implmeneting container classes. 
    - Create a class for data clumps, i.e. groups values that do not have any methods on them.

- Strategy:
    - Approaching the problem
        - Clarify the question
        - Work on concrete examples
        - Spell out the brute-force solution
        - Think out loud
        - Apply patterns
    - Presenting the solution 
        - Libraries
        - Focus on the top-level algorithm
        - Manage the whiteboard
        - Assume valid inputs
        - Test for corner cases
        - Syntax
        - Memory Management
        - Time Complexity
        



