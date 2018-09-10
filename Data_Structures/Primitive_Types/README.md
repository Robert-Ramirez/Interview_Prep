# Primitive Types #

> A program updates variables in memory according to its instructions. Variables come in types- a type is a classification of data that spells out possible values for
  that type and the operations that can be performed on it. A type can be provided by the language or defined by the programmer. Many languages provide types for
  Boolean, integer, character, and flooting point data. Often, there are multiple integer and floating point types, depending on signedness and precision. The width of 
  these types is the number of bits of storage a corresponding variable takes in memory. In java an int is always 32 bits.
  
- General Info

    [Expression Table](Files/Expressions_Table.pdf)
    
    ![picture alt](Files/Primitive_Types.JPG)

Know how int, char, double, etc.. are represented in memory and the primitive operations on them.

- Common Problems
    - [The Bitwise Operators](https://www.tutorialspoint.com/java/java_basic_operators.htm)
    - [Constant denoting the maximum and minimum values for numerical types](https://howtodoinjava.com/java/basics/primitive-data-types-in-java/)
        - Integer.Min_Value
        - Float.Max_Value
        - Double.Size
        - Boolean.True
    - [Box-types](http://zetcode.com/lang/java/datatypes2/)
        - Boolean.valueOf(true)
        - Integer.parseInt("42")
        - Float.toString(-1.23)
    - [Box-type static methods for comparing values](http://zetcode.com/lang/java/datatypes2/)  
        - Double.compare (x, 1.23) = 0
    - [Math methods](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)
        - abs (-34.5)
        - ceil (2.17)
        - floor (3.14)
        - min (x, -4)
        - max (3.14, y)
        - pow (2.71, 3.14)
        - sqrt (225)
    - [Limits of autoboxing](https://effective-java.com/2010/05/the-advantages-and-traps-of-autoboxing/) 
        - Why Character[] C = new char [] {'a', 'b'}; will not compile
    - [Interconvert types](https://docs.oracle.com/javase/tutorial/java/data/converting.html) 
        - Character.getNumberValue(x)
        - String.valueOf(123)
    - [Random Methods](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html)
        - nextInt(16)
        - nextInt()
        - nextBoolean()
        - nextDouble()
 
- Practice Code:
    - [X] [countBits](Code/EPI/countBits.java)   
    - [X] [Bitwise Operators](Code/Practice/bitwiseMethods.java)   
    - [X] [Math Library](Code/Practice/mathMethods.java)   
    - [X] [Box-Types](Code/Practice/boxMethods.java)   
    


