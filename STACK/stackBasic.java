package STACK;

import java.util.Scanner;

public class stackBasic {
    static class Stack {
        private int[] arr;
        private int top;
        private int capacity;

        // Constructor to initialize the stack
        public Stack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        public void push(int x) {
            if (isFull()) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = x;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top];
        }

        public int size() {
            return top + 1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());

        stack.pop();
        System.out.println("After pop, top element is: " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Stack is empty: " + stack.isEmpty());
    }
}

