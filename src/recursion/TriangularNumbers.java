package recursion;

/**
 * <p>
 * Triangular Numbers are a sequence of numbers where the element
 * at nth position can be calculate by getting the number at n-1 position
 * and adding to the value of n, for example:
 * </p>
 * 
 * <code>{1, 3, 6, 10, 15}</code>
 * 
 * <p>
 * the number after 15 is at position 6, so to calculate the value
 * at position 6 we add 6+15 = 21, so the sequence becomes:
 * </p>
 * 
 * <code>{1, 3, 6, 10, 15, 21}</code>
 */
public class TriangularNumbers {

    public static void main(String[] args) {
        System.out.println(triangule(1000));
        System.out.println(recursiveTriangule(1000));
    }

    public static int recursiveTriangule(int n) {

        if (n != 0) {
            return n + recursiveTriangule(n - 1);
        } else {
            return 0;
        }

    }

    public static int triangule(int n) {
        int total = 0;

        while (n > 0) {
            total = total + n;
            --n;
        }

        return total;
    }

}