# Stack

- Linear data structure that follows Last-In-First-Out (LIFO) principle.
- Elements added to the stack will be the first to be removed.

# Declaration and Definition

- Stack can be implemented with array and linked list.
- Stack declaration can be done as follows:
<pre> 
    public Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }
</pre>

# Types

- **Static:** Fixed size which cannot grow beyond initial capacity.
- **Dynamic:** Resizable, arrays can grow and shrink as needed.

# Memory Allocation

- In static stack, array and stack reference are stored in heap memory and the local variable and methods are stored in stack memory.
- In Dynamic stack, each node is stored in heap memory and the stack reference and methods are stored in the stack memory.

# Complexity

**Time complexity**
- Push: O(1)
- Pop: O(1)
- Peek: O(1)
- isEmpty: O(1)

**Space complexity**
- Static: O(n)
- Dynamic: O(n)

# Advantages and Disadvantages

**Advantages**
- Easy to implement, simple operations with constant time.
- Memory efficient.
- Useful in various algorithms like Depth-First Search, Expression Evaluation, Backtracting.

**Disadvantages**
- Limited size, exceeding can lead to stack overflow.
- Extra memory for storing pointers in Linked list.