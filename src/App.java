import myimplementations.LinkedList;
import utils.Creators;

public class App {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        int[] nums = Creators.generateRandomArray(10, 50);

        for(int i = 0; i < nums.length; i++) {
            list.addAtStart(nums[i]);
        }
        
    }
}
