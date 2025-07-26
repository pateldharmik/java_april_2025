## String 
1. String is immutable
2. Objects cannot be changed
3. Only references can be changed.

## StringBuilder
1. StringBuilder is mutable.
2. Objects can be changed.
3. Multiple threads can access this is not Thread safe means together.

## StringBuffer
1. StingBuffer is also mutable.
2. Objects can be changed.
3. This is Thread safe means only one thread can access StringBuffer.

## String vs. String Constant Pool.
1. If a String is created using a "new" keyword (e.g., String s1 = new String("Demo")) then a string object is created in the heap memory.
2. If a String is created using string literal (e.g., String s2 = "Demo"), then a String object is created in the String Constant Pool.
3. If we want to compare two strings, .equals() will compare the values in the two strings. In the above example, if the two strings are compared using .equals(), then the answer will be true because the values of both the strings are the same.
4. if we compare string 2 using the "==" operator, then the actual reference of the strings will be checked. In the above example, if we use "==" to compare the two strings, then the answer will be false since one is in String Constant Pool and the other is in the heap memory.