package Stacks;

// Implement a stack datastructure using LinkedList instead of Arrays

import java.util.LinkedList;

public class LinkedListStack<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T value) {
        list.addFirst(value);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Error: Stack is empty");
            return null;
        }
        return list.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Error: Stack is empty");
            return null;
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
