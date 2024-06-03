# Array

- A data structure that holds the collection of same datatypes stored in contiguous memory locations.
- The declaration and definition of an array of size 10 is as follows: 

<pre>
    int[] myArray = new int[10];
</pre>

# Types

- **One Dimensional Array** - Simple linear array
<pre>
    int[] arr = new int[5];
</pre>
- **Multi Dimensional Array** - arrays of array (Matrix)
<pre>
    int[][] arr = new int[3][3];
</pre>

# Working

- **Accessing:** Array elements are accessed using their index which starts with 0 and ends with the array length - 1.
- **Iteration:** Array traversal is done with the help of loops.

# Dynamic Array

- Java supports dynamic array named ArrayList which is resizable, with the help of util package.
- Operations: 
<pre>
    Adding elements to ArrayList -> arr.add(1)
    Removing elements from ArrayList -> arr.remove(0)
</pre>

# Memory Allocation

- On the creation of an array with the **new** keyword, the reference of the variable (myArray) will be stored in the stack memory. 
- The elements of the array will be allocated in the heap memory contiguously along with their index representing address location of the value in the heap memory.

# Complexity 

**Time complexity**
- Accessing elements: O(1), <em>accessing with element's index.</em>
- Searching element: O(n), <em>traverse through the whole array.</em>
- Insertion/Deletion at the end: O(1), <em>adding or removing elements at the end done at constant time.</em>
- Insertion/Deletion at arbitrary positions: O(n), <em>traverse through the entire array.</em>

**Space complexity**
- Static array: O(n)
- Dynamic array: O(n)

# Advantages and Disadvantages

**Advantages**
- Faster access to elements with their index values.
- Simple and easy to work.
- Stored contiguously which improves cache performance.

**Disadvantages**
- Fixed size in static array which leads to wastage or insufficient memory.
- Insertion and deletion require shifting elements.
