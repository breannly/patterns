package org.example.behavioral.iterator;

public class ArrayIterator<T> implements Iterator<T> {

    private final T[] array;
    private int position = 0;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return position < array.length;
    }

    @Override
    public T next() {
        return array[position++];
    }
}
