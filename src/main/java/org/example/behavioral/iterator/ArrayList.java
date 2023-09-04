package org.example.behavioral.iterator;

public class ArrayList<T> implements Iterable<T> {

    private final T[] array;

    public ArrayList(T[] array) {
        this.array = array;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(array);
    }
}
