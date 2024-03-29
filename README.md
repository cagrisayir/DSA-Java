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

## Graphs

Graphs are incredibly versatile because they model relationships between things.

You can find in `src/Graph.java`

* Implemented with **Adjacency List**
    * Add and Remove Nodes
    * Add and Remove Edges

#### Traversal Algorithms

* Depth-first Traversal (recursive)
* Depth-first Traversal (iterative)
* Breadth-first Traversal (iterative)
* Topological Sorting
* Cycle Detection (Directed Graphs)

## Undirected Graphs

You can find in `src/WeightedGraph.java`

* implemented weighted graph

# Sorting Algorithms

## Bubble Sort

In worst => O(n^2)

* Implemented bubble sort

## Selection Sort

O(n^2)

* Implemented selection sort

## Insertion Sort

* Implemented insertion sort

## Merge Sort

O(n * logn)

## Quick Sort

`src/QuickSort.java`

## Counting Sort

`src/CountingSort.java`
O(n)

Values should be positive integers.

## Bucket Sort

`src/BucketSort.java`

------------------------------------------------

# Searching Algorithms

`src/Search.java`

* **Linear Search** implemented.
    * *O(n)*


* **Binary Search** implemented both way-iterative and recursive.
    * Time Complexity: *O(log n)*
    * Space Complexity:
        * Recursion: *O(log n)*
        * Iterative: *O(1)*

* **Ternary Search**
    * Time Complexity: *O(log3 n)*
    * Binary Search faster than Ternary Search due to number of conditions.

* **Jump Search**
    * Improvement of Linear Search.
    * Better than Linear Search.
    * Binary Search faster than Jump Search.

* **Exponential Search**
    * We use binary search in it.
    * O(log i)

------------------------------------------------

# String Manipulation Algorithms

`src/StringUtils.java`

1. Find the number of vowels in a String.
    * A, E, O, U, I.
    * hello -> 2.
2. Reverse a string.
    * hello -> olleh
3. Reverse the order of words in a sentence.
    * Trees are beautiful -> beautiful are Trees
4. Check if a string is a rotation of another string.
    * "ABCD", "CDAB" -> true
    * "ABCD", "ADBC" -> false
5. Remove duplicate chars in a string.
    * "helloooo!!" -> "helo!"
6. Find the most repeated char in a string.
    * Helloooo -> 'o'
7. Capitalize the first char of word.
    * Also, remove extra spaces
    * "trees are beautiful" -> "Trees Are Beautiful"
8. is Anagram?
    * "abcd", "adbc" -> true
    * "abcd", "acbe" -> false
9. is palindrome?
    * "abba" -> true
    * "abcba" -> true
    * abac -> false