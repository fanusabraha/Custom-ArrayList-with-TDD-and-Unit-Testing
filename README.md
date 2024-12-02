Overview
This assignment challenges you to enhance and refactor your CustomArrayList from Assignment 5 using Test Driven Development (TDD) and implement the CustomList interface provided above. You will write unit tests first and then implement the methods in your CustomArrayList to ensure it adheres to the interface's specifications.

Objectives
Enhance Functionality

Add new features to your CustomArrayList using the CustomList interface.
Test Driven Development (TDD)

Write unit tests first to define expected behavior.
Implement or refactor methods to pass the tests.
Learn Unit Testing

Practice writing unit tests for key functionalities like adding, removing, retrieving elements, and handling exceptions.
Key Methods to Implement
Your CustomArrayList should implement all methods defined in the CustomList interface:

1. Add an Item
Add an item to the end of the list.
Example:
java
Copy code
boolean add(T item);
2. Add an Item at a Specific Index
Insert an item at a given index, shifting other elements to the right.
Throws IndexOutOfBoundsException if the index is invalid.
Example:
java
Copy code
boolean add(int index, T item);
3. Get List Size
Return the number of elements in the list.
Example:
java
Copy code
int getSize();
4. Retrieve an Element
Return the element at a specific index.
Throws IndexOutOfBoundsException if the index is invalid.
Example:
java
Copy code
T get(int index);
5. Remove an Element
Remove an element at a specific index and shift remaining elements left.
Throws IndexOutOfBoundsException if the index is invalid.
Example:
java
Copy code
T remove(int index);
Steps to Complete the Assignment
1. Write Unit Tests
Use JUnit (or another testing framework) to create tests for each method.
Write tests for edge cases like:
Adding to a full list (if using fixed-size array).
Retrieving or removing elements at invalid indexes.
Adding elements to the middle or beginning of the list.
2. Implement Methods
Write implementations for each method in the CustomArrayList class.
Ensure each method passes all relevant unit tests.
3. Refactor and Optimize
After all tests pass, review your code for improvements and optimizations.
Example Test Cases
Test Case: Add Item
java
Copy code
@Test
public void testAddItem() {
    CustomList<Integer> list = new CustomArrayList<>();
    assertTrue(list.add(10));
    assertEquals(1, list.getSize());
    assertEquals(10, list.get(0));
}
Test Case: Remove Item
java
Copy code
@Test
public void testRemoveItem() {
    CustomList<Integer> list = new CustomArrayList<>();
    list.add(10);
    list.add(20);
    int removedItem = list.remove(0);
    assertEquals(10, removedItem);
    assertEquals(1, list.getSize());
    assertEquals(20, list.get(0));
}
Test Case: Add Item at Index
java
Copy code
@Test
public void testAddItemAtIndex() {
    CustomList<Integer> list = new CustomArrayList<>();
    list.add(10);
    list.add(20);
    list.add(1, 15); // Insert 15 at index 1
    assertEquals(3, list.getSize());
    assertEquals(15, list.get(1));
}
Skills You Will Gain
Test Driven Development (TDD)
Writing tests before implementation to guide your code design.
Unit Testing
Writing comprehensive test cases for methods and edge cases.
Interfaces and Abstraction
Implementing an interface and adhering to its contract.
Array Manipulation
Understanding how to manage dynamic arrays and implement list behaviors manually.
