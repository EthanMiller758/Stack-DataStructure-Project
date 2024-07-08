package Stacks;

import static Stacks.StackArrays.isPalindrome;

public class Main {
    public static void main(String[] args) {
        StackArrays stackArrays = new StackArrays(5);
        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(3);
        stackArrays.isEmpty();
        stackArrays.isFull();

        System.out.println("Popped value: " + stackArrays.pop());
        System.out.println("Peeked value: " + stackArrays.peek());

        String word = "racecar";
        System.out.println(word + " is a palindrome: " + isPalindrome(word));

        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        linkedListStack.push(10);
        linkedListStack.push(20);
        System.out.println("Popped value from LinkedListStack: " + linkedListStack.pop());

    }
}
