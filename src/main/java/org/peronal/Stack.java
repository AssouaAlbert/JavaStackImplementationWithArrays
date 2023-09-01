package org.peronal;


import java.util.Arrays;

public class Stack {
    private int lastItem = 0;
    private int[] items = new int[0];

    protected void push(int newItem) {
        System.out.println("New Item: " + newItem);
        int[] newItems = new int[items.length + 1];
        System.arraycopy(items, 0, newItems, 0, items.length);
        int index = items.length;
        newItems[index] = newItem;
        items = newItems;
        lastItem = newItem;
        System.out.println("Items Lenght: " + items.length);
    }

    protected void pop() {
        int tempLastItem = lastItem;
        int[] tempItems = new int[items.length - 1];
        System.arraycopy(items, 0, tempItems, 0, tempItems.length);
        items = tempItems;
        lastItem = items[items.length - 1];
//        return tempLastItem;
    }

    protected void peek() {
        System.out.println("Stack: " + Arrays.toString(items));
    }

}
