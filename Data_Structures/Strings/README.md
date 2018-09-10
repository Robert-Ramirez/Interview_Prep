# Strings #

> A string can be viewed as a special kind of array, namely one made out of characters. 
  We treat strings seperately from arrays because certain operations which commonly applied to
  strings - for example, comparison, joining, splitting, searching for substrings, and replacing
  one string with another, parsing, etc... - do not make sense for general arrays.

Know how strings are represented in memory. 

- Understand basic operators, such as:
         - Comparison
         - Copying
         - Matching
         - Joining
         - Splitting
         - etc...

- Common Problems
    - Similiar to arrays, string problems often have simple brute-force solutions that uses O(n) space solutions,
      but subtler solutions that use the string itself to reduce the space complexity to O(1).
    - Understand the implication of a string type which is immutable, the need to allocate a new string when
      concatenating immutable strings. Know alternatives to immutable strings (StringBuilder).
    - Updating a mutable string from the front is slow, so see if it's possible to write values from the back.

     
- Library
    - String class
     - Key Methods
        - charAt(1)
        - compareTo("Foo")
        - concat("bar") (returns a new string - does not update the invoking string)
        - contains ("aba")
        - endsWith ("YZ")
        - indexOf("needle")
        - indexOf("needle", 12)
        - indexOf('A')
        - indexOf('B', "ABC")
        - lastIndexOf("needle")
        - length()
        - replace('a', 'A')
        - replace("a", "ABC")
        - "foo::bar::abc".split("::")
        - startsWith(prefix)
        - startsWith("www", "http://".length())
        - substring(1)
        - substring(1, 5)
        - toCharArray()
        - toLowerCase()
        - trim()
        - substring() method is particularly important and also easy to get wrong, since it has two variants:
          one takes a start index, and return a suffix (easily confused with prefix) and the other takes a start and end index 
          (the returned substring includes the character at start but not the character at end).

    - StringBuilder class
         - Needed because Java strings are immutable, so to make string efficient, it's necessary to have a mutable string class.
         - Key methods in StringBuilder:
            - append()
            - charAt()
            - delete()
            - deleteCharAt()
            - insert()
            - replace()
            - toString()


- Practice Code:
    - [X] [Palindromic](Code/EPI/Palindromic.java)   
