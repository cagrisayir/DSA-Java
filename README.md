# Data Structures and Algorithms

## Arrays

You can access custom Dynamic Array Class from `src/Array.java`

## Linked Lists

You can access custom Linked List Class from `src/LinkedList.java`

## Stacks

You can access custom Stack Class from `src/Stack.java`

Also, you can find the solution of questions below in `src/StackInterview.java`

#### Created Custom stack class using array.

### [Solved] Common Interview Questions

#### 1 - Reverse a string`src/StackInterview`

#### 2 - Balanced Expressions `src/StackInterview`

## Queue

You can access custom Queue with Array from `src/ArrayQueue.java`

## Hash Tables

You can access custom Hash Table implementation from `src/HashTable.java`

(Collisions are handled with Linked Lists [chaining] )

**Question**: First non-repeating char `src/CharFinder.java`
**Question**: First repeated char `src/CharFinder.java`

# Trees

## Binary Trees

You can find in `src/Tree.java`

* implementation 1: **insert** -> O(log n)
* implementation 2: **find** -> O(log n)
* implementation 3: **traverse** -> pre, in, post order
* implementation 4: **height of tree**
* implementation 5: **Min value in a tree** O(n)
* implementation 6: **Min value in a Binary Search tree** O(log n)
* implementation 7: **Max value in a tree** O(n)
* implementation 8: **Level order Traversal**

**Exercises**

* Equality Checking
* Validating BST
* Nodes at K Distance

## AVL Trees

We use AVL trees to balance the unbalanced trees.

You can find in `src/AVLTree.java`

* Implemented *insert*
* Height calculation
* Balance Factor calculated `balanceFactor = height(L) - height(R)`
    * if balance factor > 1 than it is "Left heavy"
    * if balance factor < -1 than it is "Right heavy"
* Implemented **Rotation**

## Heaps

You can find in `src/Heap.java`

* Implemented *Insert*
* Implemented *Bubble up*
    * Found Parent with `(index - 1) / 2`
    * *Swap*ed
* Implemented *remove*
    * Removed the root
    * **Bubble Down** implemented.
* Implemented Priority Queue as a Heap
    * `src/PriorityQueueHeap.java`
    * in queues insert is O(n)
        * with heap, we decrease it to O(log n)
* Implemented **Heapify**
* Kth Largest Item
    * `src/MaxHeap.java`

## Tries

Mostly use for Autocompletion.

You can find in `src/Trie.java`

* **Lookup** -> O(L) -> L: Length of the word. (Constant)
* **Insert** -> O(L)
* **Delete** -> O(L)

* Implemented *insert* with HashMap
* Implemented *contains*
* Implemented *remove*
* Implemented *Auto Completion*




