# Assignment2

MyArrayList class:

MyArrayList is a class that implements the MyList interface. 
It is a dynamic array that allows the user to add, remove, sort, and access items stored in the array.

MyLinkedList:

This is a implementation of a doubly linked list data structure that implements the MyList interface. 
A doubly linked list is a linear data structure in which elements are stored in nodes. 
Each node has a pointer to the next and previous node in the list, allowing for efficient traversal in both directions.


Interface called MyList consists of the following methods:

int getSize() -This method returns the number of elements in the list.

boolean contains(T object) - returns true if the list contains the object, false otherwise.

void add(T newItem) - This method adds a new item of type T to the end of the list.

void add(T newItem,int index) - This method adds a new item of type T at the specified index in the list.

boolean remove(T item) - removes the first occurrence of the specified item from the list and returns true if successful, false otherwise.

T remove(int index) -  removes the item at the specified index in the list and returns the removed item.

void clear() -  removes all items from the list

T get(int index) -  returns the item at the specified index in the list

int indexOf(T object) - returns the index of the first occurrence of the specified object in the list, or -1 if not found

int lastIdexOf(T object) - returns the index of the last occurrence of the specified object in the list, or -1 if not found

void sort() - sorts the list in ascending order 
