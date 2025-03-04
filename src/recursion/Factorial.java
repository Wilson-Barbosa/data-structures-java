package recursion;

/**
 * </p>
 * Factorials are a common example of how recursion works. A factorial can
 * be expressed by the following expression:
 * </p>
 * 
 * <code> n! = n.(n-1)! </code>
 * 
 * <p>
 * As you can see, a factorial can be expressed as another factorial and this
 * is the the core of recursion: a problem can be devided on smaller, equal
 * problems.
 * </p>
 */
public class Factorial {
    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(factorialRecursive(5));
    }

    public static int factorial(int n) {
        int total = 1;

        while (n != 0) {
            total = total * n;
            n--;
        }

        return total;
    }

    public static int factorialRecursive(int n) {

        if (n == 0) {
            return 1; // base case (prevents stack overflow)
        } else {
            return (n * factorialRecursive(n - 1)); // recursive case
        }

    }

}
