package ADT.Stack;

/**
 * @author Albert Hambardzumyan
 */
public class Stack<T> {
    private class Node {
        private T value;
        private Node next;
    }

    private Node head = null;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(T newValue) {
        Node newNode = new Node();
        newNode.value = newValue;
        newNode.next = head;
        head = newNode;
    }

    public void pop() {
        if (!isEmpty()) {
            head = head.next;
        }
    }

    public T top() {
        return isEmpty() ? null : head.value;
    }
}