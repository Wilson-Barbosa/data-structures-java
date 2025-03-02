import myimplementations.LinkedList;
import sorting.IntSorting;
import utils.Creators;

public class App {
    public static void main(String[] args) {

        int[] nums = Creators.generateRandomArray(100000, 100);
        String bubbleOutput = "Bubble sorted:    ";
        String selectionOutput = "Selection sorted: ";

        int[] bubble = IntSorting.bubbleSort(nums); // sort with bubble sort
        int[] selection = IntSorting.selectionSort(nums); // sort with selection sort

        // // print the result
        // for (int i : bubble) {
        //     bubbleOutput += i + " ";
        // }
        // System.out.println(bubbleOutput);

        // // print the result
        // for (int i : selection) {
        //     selectionOutput += i + " ";
        // }
        // System.out.println(selectionOutput);
    }
}
