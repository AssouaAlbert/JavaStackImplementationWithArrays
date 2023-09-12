package org.peronal;
public class Main {


    public static void main(String[] args) {
        long n = 10;
        int d = (int)n;
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.peek();
        stack.push(3);
        stack.push(55);
        stack.push(58);
        stack.push(59);
        stack.peek();
        stack.pop();
        stack.peek();
    }
}