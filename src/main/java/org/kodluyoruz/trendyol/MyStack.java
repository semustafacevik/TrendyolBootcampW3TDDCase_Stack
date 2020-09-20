package org.kodluyoruz.trendyol;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {

    List<T> myStack = new ArrayList<>();

    public void push(T element) {
        if(element == null){
            throw new IllegalArgumentException("Element must not be null!");
        }

        myStack.add(element);
    }

    public int count() {
        return myStack.size();
    }

    public T pop() {
        return null;
    }
}
