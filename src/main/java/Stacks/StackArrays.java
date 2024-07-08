package Stacks;

import java.util.Stack;

public class StackArrays {
    int [] arr;
    int topOfStack;

    public StackArrays(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with a size of: " + size);
    }

    // Check if it is empty

    public boolean isEmpty(){
        if (topOfStack == -1){
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    // check if stack is Full
    public boolean isFull(){
        if (topOfStack == arr.length -1){
            System.out.println("Stack is full");
            return true;
        } else {
            System.out.println("Stack is not full");
            return false;
        }
    }

    // implement a push method
    public void push(int value){
        if (isFull()){
            System.out.println("the stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }

    // implement pop method

    public String pop() {
        if (topOfStack == -1) {
            System.out.println("Error: Stack is empty");
            return null;
        }
        String poppedValue = String.valueOf(arr[topOfStack]);
        topOfStack--;
        return poppedValue;
    }

    //implement peek

    public String peek() {
        if (topOfStack == -1) {
            System.out.println("Error: Stack is empty");
            return null;
        }
        return String.valueOf(arr[topOfStack]);
    }

    //implement delete a stack

    public void deleteStack() {
        topOfStack = -1;
        System.out.println("Stack deleted.");
    }

    // use the stack datastructure to check whether a word is a palindrome or not eg racecar  == racecar

    public static boolean isPalindrome(String word) {
        Stack<Character> charStack = new Stack<>();
        for (char c : word.toCharArray()) {
            charStack.push(c);
        }
        StringBuilder reversedWord = new StringBuilder();
        while (!charStack.isEmpty()) {
            reversedWord.append(charStack.pop());
        }
        return word.equalsIgnoreCase(reversedWord.toString());
    }
}
