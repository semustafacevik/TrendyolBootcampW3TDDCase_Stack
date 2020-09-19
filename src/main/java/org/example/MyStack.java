package org.example;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {

    List<T> myStack = new ArrayList<>();

    public void push(T element) {
        myStack.add(element);
    }

    public int count() {
        return myStack.size();
    }
}
