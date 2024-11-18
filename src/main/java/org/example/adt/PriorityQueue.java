package org.example.adt;

public interface PriorityQueue<T> {

    T getFirst();
    T getPriority();
    void remove();
    void add(T value, T priority);
    boolean isEmpty();

}
