package com.datastructures.utils;

import java.util.Random;

import com.datastructures.book.arrays.OrderedArray;



public class Creators {
    
    /**
     * <p>Creates and returns a populated array of ints containing <code>size</code> elements inside of it.</p>
     * <p>The array contains elements from 0 to 9999 inclusive and allows for duplicate numbers.</p>
     * 
     * @param size is the array's size
     * @return the populated array
     */
    public static int[] generateRandomArray(int size){
        int[] array = new int[size]; 
        Random random = new Random();

        for (int i = 0; i < size - 1; i++) {
            array[i] = random.nextInt(10000);
        }

        return array;
    }

    /**
     * <p>Creates and returns a populated array of ints containing <code>size</code> elements inside of it.</p>
     * <p>The array contains elements from 0 to <code>upperBound</code> inclusive and allows for duplicate numbers.</p>
     * 
     * @param size is the array's size
     * @param upperBound the upperBound limit for array's number size
     * @return the populated array
     */
    public static int[] generateRandomArray(int size, int upperBound){
        int[] array = new int[size]; 
        Random random = new Random();

        for (int i = 0; i < size - 1; i++) {
            array[i] = random.nextInt(upperBound);
        }

        return array;
    }

    /**
     * Creates an orderedArray instance with methods for searching and printing elements
     * 
     * @param size is the array's max size
     * @param upperBound the highest number possible
     * @return an OrderedArray instance
     */
    public static OrderedArray generateRandomOrderedArray(int size, int upperBound){
        return new OrderedArray(generateRandomArray(size, upperBound));
    }

}
