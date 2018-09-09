# Primitive Types #

Know how int, char, double, etc.. are represented in memory and the primitive operations on them.

-    ![picture alt](Files/Primitive_Types.JPG)

- Need to know 
    - Sizes
    - Ranges
    - Signedness properties
    - operators
    - utility methods for primitive types in Math
    - difference between box-types(Integer, Double, etc...) and primitive types
    - role of auto-boxing and the limits of auto-boxing.

- Practice Code:
- [ ] [countBits](countBits.java)


- Need to Know 
    - [The Bitwise Operators](https://www.tutorialspoint.com/java/java_basic_operators.htm)
    - [Constant denoting the maximum and minimum values for numerical types](#Constant)
        - Integer.Min_Value
        - Float.Max_Value
        - Double.Size
        - Boolean.True
    - [Box-types](#Box)
        - Boolean.valueOf(true)
        - Integer.parseInt("42")
        - Float.toString(-1.23)
    - [Box-type static methods for comparing values]()  
        - Double.compare (x, 1.23) = 0
    - [Math methods](#math)
        - abs (-34.5)
        - ceil (2.17)
        - floor (3.14)
        - min (x, -4)
        - max (3.14, y)
        - pow (2.71, 3.14)
        - sqrt (225)
    - [Limits of autoboxing](#autoboxing) 
        - Why Character[] C = new char [] {'a', 'b'}; will not compile
    - [Interconvert types](#convert) 
        - Character.getNumberValue(x)
        - String.valueOf(123)
    - [Random Methods, return a value in [0, 1)](#randome)
        - nextInt(16)
        - nextInt()
        - nextBoolean()
        - nextDouble()
    
    


