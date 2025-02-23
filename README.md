# About this repository
This is a little repository I created to implement a few data strucutes I'm learning about using the old, but really good book by Robert Lafore: `Data Structures and Algorithms in Java`.

Right at the beggining the author introduces a tool called `Workshop Applets` for data visualization. I assume this is available somewhere, but I've found an online browser implementation that can be accessed [here](https://spro.blog/lafores-applets/). Big ups to Stanislav Proshkin, who created it. 

Of course there are other tools out there as well like [this one](https://www.cs.usfca.edu/~galles/visualization/), so feel free to seek them out.

## The big O notation

### Introduction
In summary the Big O Notation is a way to analyze the performance of an algorithm. Usually speaking, perfomance within an algorithm can be a little tricky to define and it can be describe using a variety of methods. The first and most obvious one is time in seconds for example. Let's take an example for a simple array:

Assume you have an array of int numbers, like this one:

```java
int[] array = { 5, 2, 10, 1, 5, 7, 8, 3, 17, 18, 19, 1, 6, 14, 12 };
```

You can ask yourself how long it would take for a number, lets say 8, to be searched inside the array. Or you maybe you want to know the time to add a new number (maybe 1000) to it. Answering these questions in terms of seconds or fractions of seconds can depend on a multitude of factors, such as CPU model, temperature, other processes running concurrently etc. Although tools that can calculate this exist and can be really useful maybe there is another way to determine efficiency and performance.

### How to think 
Instead of thinking about raw time in seconds let's think about how time relatively increases or decreases based on the array's size.

Generally speaking when you have an unordered array and you search for a given element inside it you need to interate, on average N/2 times, where N is the array's size. If you double the array size you just double the iterations. So we can abstract way the actual time by thinking about how much steps or operations are performed on an array (or any data-structure) when we increase its size. In this case, we say that the time for this search operation is linear and proportional to the array's size:

* Search in unordered array: O(n)

To delete an item you need to search it first, so you can describe like:
* Delete in unordered array: O(n)

To insert an item you only need one operation, as it'll be inserted at the array's end. This is contant time:
* Insertion in unordered array: O(1)

Of course, this example doesn't consider factors like duplicate values, null values etc, but demonstrates the strategies for analysing algorithms. 

## Sorting
Sorting is the process of organizing and ordering a collection of data based on a condition, like a key value (1, 2, 3...) or alphabetical order (a, b, c...), for example. The topic of sorting is extremely important because they can severely impact perfomance and lots of sorting strategies exist. Initially, for begginers it's nice to study the simpler ones.

The Workshop applets are EXTREMELY useful for sorting visualization.

### Bubble sort
This sorting algorithm is the probably the most simpler, but also extremely inefficient. Real world applications won't use, because its time complexity is O(n²), but its simple implementations helps understanding how sorting works. 

### Selection sort

### Insertion sort

## Data structures

### Definition
Data structures can be define as an arrangement of data that can be manipulated in different ways. Arrays are on themselves data structures albiet simple and straightforward, but you can find more complex ones, like binary trees, graphs etc. They help developers solve difficult problems by modeling real-world scenarios and also can simplify and abstract away complex implementations. 

The topics of algorithm perfomance, big O notation and data structures are closely related. Different structures provide different implementations of insertion, deletion, search and traversal that can be faster os slower depending on the structure in question and its size for example. Each operation can have a time complexity associate with it and it's useful to describe these operations based on these metrics.

### Arrays
Linear, fixed-size, zero index-based, data structures. The most basic data structure that can also be used to implement other, more complex ones.

Time complexity for unordered, non-null, non duplicate values:
* Insertion: O(1)
* Deletion: O(n)
* Search: O(n)

Time complextity for unordered, non-null, duplicated allowed values:
* Insertion: O(1)
* Deletion: O(n)
* Search: O(n)

### Ordered Arrays
Ordered arrays are normal arrays, but sorted by some value. This property comes in handy when you consider the time complexity for binary search O(logN).

Time complexity for ordered arrays:
* Insertion: O(n)
* Deletion:
* Search: O(logN) using binary search

### Stacks
Stacks, like queues, are more abstract data strucutures when compared to arrays, usually used by programmers as tools for acomplishing a task they help with difficult problems and can even be used in conjuction with other data structures.

Instead of an array, where all element can be accessed at any time (given you provide the index), stacks have a restriction for element access. They follow a principle where elements are placed on top of each other and you can only access the last element inserted and this position is called `top` of the stack. This access restriction is famously described by the acronym FILO (first-in, last-out).

It's possible to define the core operations for stacks as the following:

* Peek returns the value stored at the stack's top
* Push adds an element at the top of the stack
* Pop removes the element at the top and returns it 

Stacks can be implemented with different structures, like an array or a linkedList, for example, but for the user (or client), it really doesn't matter what implementation is choosen, since the FILO principle is followed.

Because of their access restriction the time complexity for operations mentioned above is constant:
* Return the top element: O(1)
* Insertion on stack: O(1)
* Deletion from stack: O(1)


### Queues
Queues are another data structures that can be used more as a tool than a storage system. They are similar to stacks in the fact they provide a access restriction to their elements. Stacks follow the FILO principle, but queues follow the FIFO (first-in, first-out) principle, very much like queues in real life. To acomplish this queues must track the front and back elements and these variables are usually called `front` and `rear`.

Like stacks queues can be implemented using a variety of data-structures.

Common operations for queues are as follow:
* Insert a new element at the rear position
* Remove an element at the front position
* Peek to return the value at the front position

Again, like stacks, the access restriction allows for extremely fast operations in constant time:
* Insert: O(1)
* Remove: O(1)
* Peek: O(1)

One thing to notice it that when you implement a queue using an array you don't really move the items around, like when queue and dequeue elements you just move the rear and front variables to point to different elements. This is because moving the item would require copying, deleting and adding them to another array, which would require extra time O(n) and operations, while moving the pointers of rear and front is O(1).

### Deques
Dequeues are more versatile than stacks and queues, and they allow the possibility of adding and removing elements from both ends (the front or read). They can be used in some use cases, but because their are not as common as the 2 previous ones the book chooses not to discuss them futher.

### Priority Queues
Priority queues are normal queues with a front and rear, but one caviat, the items are stored ordered by a given key value. Elements with lower keys are stored at the front and higher ones are the rear (although this can be inverted in some implementations). Since elements are ordered by a key value insertion on a priority queue doesn't happen only in the back, but rather it's put on their appropriate position, which can be slower or faster depending on your implementation.

The advantage here is clear, you can assign elements a value and they will called for execution based on they level of priority.

Usually you want a quick insertion with priority queues and they are often implemented with using a heap, another data structure.

## The java collections framework
The concept of performance and complexity is especially important when working with `data collections`. This term is very appropriate within the Java world within the `Collections Framework`. On itself this is "just" a collections of classes, interfaces and algorithms to help developers program and work with sets of data in a standardlized and efficent manner.

For more info about it check the official docs at oracle:

* [Java SE 8 - The Collections Framework](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/)
* [Tutorial: collections](https://docs.oracle.com/javase/tutorial/collections/intro/index.html)