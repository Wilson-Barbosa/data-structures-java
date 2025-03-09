package com.datastructures.book.sorting;

/**
 * Class that provides sorting algorithms for int[] arrays. Most methods return
 * a copy of the previous array so it's easier to test things.
 */
public class IntSorting {

    /**
     * <p>
     * Receives an array of int numbers and sorts it using the famous (and quite
     * slow) bubble sort algorithm. It also prints inside the terminal a few
     * messages about the number of comparions or swaps done during the process.
     * </p>
     * 
     * <p>
     * <code>Swap</code> indicates how many times elements were swaped with each
     * other.
     * </p>
     * 
     * <p>
     * <code>Comparisons</code> indicates how many steps or checks it took to sort
     * the whole array.
     * </p>
     * 
     * <p>
     * The sorting assumes there are no <code>null</code> values within the passed
     * array.
     * </p>
     * 
     * @param a the array to be sorted
     * @return a sorted copy of the array
     */
    public static int[] bubbleSort(int[] a) {

        int[] array = a.clone();
        int temp = 0;
        int upperIndex = array.length - 1;
        long swapCount = 0;
        long numComparisons = 0;
        boolean itemWasSwapped = false;

        while (true) {

            if (upperIndex == 0) {
                System.out.println("\nArray sorted with: " + swapCount + " swaps.");
                System.out.println("Number of comparisons: " + numComparisons + " comparisons.");
                return array;
            }

            for (int i = 0; i < upperIndex; i++) {
                numComparisons++;
                // if the left is bigger than right swap the items
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    swapCount++;
                    itemWasSwapped = true;
                }
            }

            if (!itemWasSwapped) {
                System.out.println("\nArray was already sorted. Number of comparisons made: " + numComparisons);
                return array;
            }

            upperIndex--; // don't need to compare the last element anymore
        }

    }

    /**
     * <p>
     * Takes an an unordered array of int numbers and sorts it using
     * <code>selection sort</code> returning a sorted copy. Also, a few messages
     * will be printed in the console.
     * </p>
     * <p>
     * <code>Swap</code> indicates how many times elements were swaped with each
     * other.
     * </p>
     * 
     * <p>
     * <code>Comparisons</code> indicates how many steps or checks it took to sort
     * the whole array.
     * </p>
     * 
     * <p>
     * The sorting assumes there are no <code>null</code> values within the passed
     * array.
     * </p>
     * 
     * @param a the unordered array
     * @return a sorted copy of the array
     */
    public static int[] selectionSort(int[] a) {

        int[] array = a.clone();
        int lowerIndex = 0;
        int upperIndex = array.length - 1;
        long numComparisons = 0;
        long swapCount = 0;

        // starting the traversal:
        while (lowerIndex <= upperIndex) {

            int minIndex = lowerIndex;

            for (int i = lowerIndex; i <= upperIndex; i++) {
                numComparisons++;
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }

            // after the lowest is found swap it with the lowerIndex
            if (minIndex != lowerIndex) {
                int temp = array[lowerIndex];
                array[lowerIndex] = array[minIndex];
                array[minIndex] = temp;
                swapCount++; // I'm wrapping the swap only to track it's own count, that's not needed
            }

            lowerIndex++; // and increment it
        }

        System.out.println("\nArray sorted with: " + swapCount + " swaps.");
        System.out.println("Number of comparisons: " + numComparisons + " comparisons.");

        return array;
    }

    /**
     * <p>
     * Takes an an unordered array of int numbers and sorts it using
     * <code>insertion sort</code> returning a sorted copy. Also, a few messages
     * will be printed in the console.
     * </p>
     * <p>
     * <code>Swap</code> indicates how many times elements were swaped with each
     * other.
     * </p>
     * 
     * <p>
     * <code>Comparisons</code> indicates how many steps or checks it took to sort
     * the whole
     * array.
     * </p>
     * 
     * <p>
     * The sorting assumes there are no <code>null</code> values within the passed
     * array.
     * </p>
     * 
     * @param a the unordered array
     * @return a sorted copy of the array
     */
    public static int[] insertionSort(int[] a) {

        int[] array = a.clone();
        int upperIndex = a.length;
        int temp;
        int swaps = 0;
        int shifts = 0;

        for (int i = 1; i < upperIndex; i++) {

            temp = array[i]; // to-be-sorted item
            int rightIndex = i - 1;

            // shitf elements one position to right until you reach array's end or find the
            // right place
            while (rightIndex >= 0 && temp <= array[rightIndex]) {
                array[rightIndex + 1] = array[rightIndex];
                shifts++;
                rightIndex--;
            }
            array[rightIndex + 1] = temp;
            swaps++;

        }

        System.out.println("Array sorted with " + shifts + " shitfs and " + swaps + " swaps.");

        return array;
    }

}
