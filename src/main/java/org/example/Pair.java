package org.example;

public class Pair<T, E> {
    private T first;
    private E second;

    Pair(T first, E second)
    {
        if (first != null) this.first = first;
        if (second != null) this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }



    @Override
    public String toString()
    {
        return String.valueOf(first) + String.valueOf(second);
    }
}
