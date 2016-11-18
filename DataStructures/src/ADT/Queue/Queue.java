package ADT.Queue;

/**
 * @author Albert Hambardzumyan
 */
public class Queue<T> {
    private class Node {
        private T value;
        private Node next;
    }

    private Node head = null, tail = null;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(T newValue) {
        Node new_node = new Node();
        new_node.value = newValue;
        new_node.next = null;

        if (isEmpty())
            head = new_node;
        else
            tail.next = new_node;

        tail = new_node;
    }

    public void pop() {
        if (!isEmpty()) {
            head = head.next;
        }

        if (isEmpty())
            tail = null;
    }

    public T top() {
        return isEmpty() ? null : head.value;
    }
}