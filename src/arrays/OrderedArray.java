package arrays;

import sorting.IntSorting;

/**
 * Ordered array of type int[]. Provides methods for searching
 * and printing the elements.
 */
public class OrderedArray {

    private int[] arr;

    public OrderedArray(int[] arr) {
        this.arr = IntSorting.selectionSort(arr);
    }

    /**
     * Searches an int inside an array using a binary search.
     * 
     * @param num is the number you wish to search
     * @param arr the array where the search will be performed
     */
    public void loopBinarySearch(int num) {

        int lowerIndex = 0;
        int upperIndex = arr.length - 1;
        int numComparisons = 0;
        boolean wasFound = false;

        while (lowerIndex <= upperIndex) {

            // grab the middle item
            int currentIndex = (upperIndex + lowerIndex) / 2;
            numComparisons++;

            // found the item
            if (arr[currentIndex] == num) {
                System.out.println("Item " + num + " found at position " + currentIndex);
                wasFound = true;
                break;
            }

            // didn't find the item
            if (arr[currentIndex] < num) {
                lowerIndex = currentIndex + 1; // search in the upper half
            } else {
                upperIndex = currentIndex - 1; // search in the lower half
            }

        }

        if (!wasFound) {
            System.out.println("Item was not found.");
        }
        System.out.println("Number of comparisons done: " + numComparisons);
    }

    /**
     * Receives a sorted array and tries to find the passed number inside it using
     * a recursive binary search algorithm.
     * 
     * @param num is the number you wish to search
     */
    public void recursiveBinarySearch(int num) {
        findRecursive(num, 0, arr.length - 1);
    }

    /** This is the actual recursive method */
    private void findRecursive(int num, int lowerBound, int upperBound) {

        if (lowerBound <= upperBound) { // base-case

            int currentIndex = (lowerBound + upperBound) / 2;

            // was found
            if (arr[currentIndex] == num) {
                System.out.println("Item " + num + " found at " + "position " + currentIndex);
                return;
            }

            // not found yet
            if (arr[currentIndex] < num) { // recursive-case
                findRecursive(num, lowerBound + 1, upperBound); // search in the upper half
            } else {
                findRecursive(num, lowerBound, upperBound - 1); // search in the lower half
            }

        } else {
            // after every item is checked, but not found
            System.out.println("The item was not found.");
        }

    }

    public void print() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

}
