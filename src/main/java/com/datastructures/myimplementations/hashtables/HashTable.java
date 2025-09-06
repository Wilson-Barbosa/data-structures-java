package com.datastructures.myimplementations.hashtables;

import java.util.ArrayList;
import java.util.List;

import com.datastructures.myimplementations.singlylinkedlist.Iterator;
import com.datastructures.myimplementations.singlylinkedlist.SinglyLinkedList;

/**
 * Implementation of a HashTable data structure. It uses an internal hash
 * function to place the items inside an ArrayList and it allows for duplicates,
 * i.e items with the same key
 * 
 * It handles collisions using the <code>separate chaining</code>, by storing
 * items with the same key inside a LinkedList.
 */
public class HashTable<K, V> {

    private ArrayList<SinglyLinkedList<Entry<K, V>>> array;
    private final double DEFAULT_LOAD_FACTOR = 0.75;
    private final int INITIAL_CAPACITY = 11;

    /**
     * Creates a new HashTable.
     */
    public HashTable() {
        this.array = new ArrayList<SinglyLinkedList<Entry<K, V>>>(INITIAL_CAPACITY);
    }

    /**
     * Adds a new item to the table.
     * 
     * @param key   the key paired with this value
     * @param value is the value you want to store
     */
    public void put(K key, V value) {

        if(calculateLoadFactorWithNewInsertion() > DEFAULT_LOAD_FACTOR) {
            rehashTable();
        }

        int index = getCompressedHash(key);
        Entry<K, V> newEntry = new Entry<>(key, value);

        if (array.get(index) == null) { // if the bucket is empty
            SinglyLinkedList<Entry<K, V>> newList = new SinglyLinkedList<>();
            newList.addAtStart(newEntry);
            array.add(index, newList);
        } else {
            array.get(index).addAtStart(newEntry);
        }

    }

    public V getFirst(K key) {

        int index = getCompressedHash(key);
        Iterator<Entry<K, V>> iterator = array.get(index).getIterator(); // grabs the bucket
        Entry<K, V> current;

        while (!iterator.atEnd()) {
            current = iterator.getCurrent();

            if (current.getKey().equals(key)) {
                return current.getValue();
            }

            iterator.nextLink();
        }

        return null;
    }

    public List<V> getAll(K key) {

        int index = getCompressedHash(key);
        Iterator<Entry<K, V>> iterator = array.get(index).getIterator();
        Entry<K, V> current;
        List<V> list = new ArrayList<>();

        while (!iterator.atEnd()) {
            current = iterator.getCurrent();

            if (current.getKey().equals(key)) {
                list.add(current.getValue());
            }

            iterator.nextLink();
        }

        return list;
    }

    public void removeFirst(K key) {
        int index = getCompressedHash(key);
        Iterator<Entry<K, V>> iterator = array.get(index).getIterator();
        Entry<K, V> current;

        while (!iterator.atEnd()) {
            current = iterator.getCurrent();

            if (current.getKey().equals(key)) {
                iterator.deleteCurrent();
                return;
            }

            iterator.nextLink();
        }
    }

    public void remmoveAll(K key) {
        int index = getCompressedHash(key);
        Iterator<Entry<K, V>> iterator = array.get(index).getIterator();
        Entry<K, V> current;

        while (!iterator.atEnd()) {
            current = iterator.getCurrent();

            if (current.getKey().equals(key)) {
                iterator.deleteCurrent();
            }

            iterator.nextLink();
        }
    }

    /**
     * Returns the quantity of items stored in this table as an integer
     */
    public int size() {
        int count = 0;

        for (SinglyLinkedList<Entry<K, V>> bucket : array) {
            if (bucket != null && !bucket.isEmpty()) {
                count += bucket.size();
            }
        }

        return count;
    }

    public boolean containsKey(K key) {
        int index = getCompressedHash(key);
        Iterator<Entry<K, V>> iterator = array.get(index).getIterator(); // grabs the bucket
        Entry<K, V> current;

        while (!iterator.atEnd()) {
            current = iterator.getCurrent();

            if (current.getKey().equals(key)) {
                return true;
            }

            iterator.nextLink();
        }

        return false;
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

    /**
     * Receives a key and hashes it, returning an index within the
     * <code>arraySize</code> range.
     */
    private int getCompressedHash(K key) {
        return Math.abs(key.hashCode() % array.size());
    }

    private double calculateLoadFactorWithNewInsertion() {
        return (this.size() + 1) / array.size(); 
    }

    private void rehashTable() {
        
    }

}

/**
 * An entry for the HashTable. Each item has both a key a the value associated
 * with it.
 */
class Entry<K, V> {

    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}
