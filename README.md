This project implements two fundamental data structures:

MyHashTable<K, V> – A hash table with chaining for collision resolution.
BST<K extends Comparable<K>, V> – A binary search tree with in-order traversal.
Both implementations avoid recursion (as required) and support key-value storage, retrieval, and deletion.

put(K key, V value) → Inserts a key-value pair.
get(K key) → Returns the value for a given key.
remove(K key) → Deletes a key-value pair.
contains(V value) → Checks if a value exists (slow, scans all buckets).
getKey(V value) → Finds the key for a given value (also slow).

A test class (Main) adds 10,000 random elements and prints bucket distribution.

put(K key, V val) → Inserts a node.
get(K key) → Returns the value for a key.
delete(K key) → Removes a node (handles 3 cases: 0, 1, or 2 children).
iterator() → Returns Iterable<Node> for traversal.

Size tracking (size() method).
Iterator works in-order (keys print sorted).
Access both key & value during iteration
for (BST<Integer, String>.Node node : tree.iterator()) {
    System.out.println("Key: " + node.getKey() + ", Value: " + node.getValue());
}

How to Run
Compile:
javac Main.java MyHashTable.java BST.java MyTestingClass.java
Execute:
java Main
