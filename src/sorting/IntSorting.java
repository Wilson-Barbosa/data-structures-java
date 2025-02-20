package sorting;

/**
 * Class that provides some sorting algorithms for int[] arrays
 */
public class IntSorting {

    /**
     * <p>Receives an array of int numbers and sorts it using the famous (and quite slow)
     * bubble sort algorithm. It also prints inside the terminal a few messages about
     * the number of comparions or swaps done during the process.</p>
     * 
     * <p>Swap indicates how many times elements were swaped with each other.</p>
     * 
     * <p>Comparisons indicates how many steps or checks it took to sort the whole array.</p>
     * 
     * <p>The sorting assumes there are no <code>null</code> values within the passed array.</p>
     * 
     * @param array the array to be sorted
     * @return the sorted array
     */
    public static int[] bubbleSort(int[] array) {

        int temp = 0;
        int upperIndex = array.length - 1;
        int swapCount = 0;
        int numComparisons = 0;
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

            if(!itemWasSwapped) {
                System.out.println("\nArray was already sorted. Number of comparisons made: " + numComparisons);
                return array;
            }

            upperIndex--; // don't need to compare the last element anymore
        }

    }

}
