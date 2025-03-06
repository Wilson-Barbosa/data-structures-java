package myimplementations.trees;

public class BinaryTree<T> {

    private Node<T> root;

    public BinaryTree() {

    }

    public void find(int key) {

    }

    public void insert(T element) {

    }

    public void delete(T element) {

    }
}

/** Node that goes inside a Binary tree. It has two references, one  */
class Node<T> {

    private T element;
    private Node<T> rightChild;
    private Node<T> leftChild;
    // private Node<> parent;   <--  It's possible to add a reference for the parent node and
    //                               this can simplify some operations, but complicate others.

    public Node(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

}