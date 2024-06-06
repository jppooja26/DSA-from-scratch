# Linked List

- A data structure that consist of nodes.
- Each node contains data and a reference to the next node.
- The creation of a node in Linked list is as follows: 

<pre>
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
</pre>

# Types

- **Singly Linked list** - Each node points to the next node.
- **Doubly Linked list** - Each node points to both the next node and it's previous node.
- **Circular Linked list** - Last node points to the 1st node.

# Working

- **Insertion:** Adding new nodes involves updating the next pointer.
- **Traversal:** Traversing the node following the next pointer from the head node.
- **Deletion:** Removing nodes involves updating the next pointer.

# Dynamic Linked List

- Java supports dynamic Linked list named LinkedList with the help of util package.
- Nodes are added or removed at the runtime without size constraint.

# Memory Allocation

- On the creation of a linked list with the **new** keyword, the reference of the variable (list) will be stored in the stack memory. 
- The node's data and reference to the next nodes will be allocated in the heap memory.

# Complexity 

**Time complexity**
- Accessing elements: O(n), <em>accessing data requires traversal through the linked list.</em>
- Searching element: O(n), <em>searching data requires traversal through the linked list.</em>
- Insertion/Deletion at the end: O(1), <em>adding or removing nodes at the end is done at constant time.</em>
- Insertion/Deletion at arbitrary positions: O(n), <em>traverse through the entire linked list.d</em>

**Space complexity**
- Extra space is required for the next (possibly prev) pointer(s) of each node along with the data.

# Advantages and Disadvantages

**Advantages**
- Dynamic size helps in easy growth and shrinkage of the linked list.
- Insertion and deletion at the end in easy especially with head and tail node.

**Disadvantages**
- Extra memory due to the pointers.
- Sequential access through the linked list makes it slower compared to array.
- More complex than array.
