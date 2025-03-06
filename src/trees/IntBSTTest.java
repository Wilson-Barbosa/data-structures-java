package trees;

import arrays.OrderedArray;

public class IntBSTTest {

    public static void main(String[] args) {

        IntBinaryTree tree = new IntBinaryTree();

        tree.insert(63); // should print item 63 at root

        tree.insert(27);
        tree.insert(80);

        tree.insert(13);
        tree.insert(51);
        tree.insert(70);
        tree.insert(92);

        tree.insert(26);
        tree.insert(33);
        tree.insert(58);
        tree.insert(82);

        tree.find(82); // should print 82, lvl 3, parent of 92

        tree.printAllElements();

        // System.out.println("\n\n");
        // int[] a = { 2, 3, 4, 5, 6, 7, 8 };
        // OrderedArray orderedArray = new OrderedArray(a);
        // IntBinaryTree bTree = new IntBinaryTree(orderedArray);


    }
}
