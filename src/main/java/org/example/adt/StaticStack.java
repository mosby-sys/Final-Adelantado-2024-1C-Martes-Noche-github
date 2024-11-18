package org.example.adt;

public class StaticStack<T> implements Stack<T> {

    private static final int MAX = 10000;

    private final T[] array;
    private int count;

    public StaticStack() {
        this.array = (T[]) new Object[MAX];
        this.count = 0;
    }

    @Override
    public T getTop() {
        if(isEmpty()) {
            throw new RuntimeException("No se puede obtener el tope una pila vacia");
        }
        return array[this.count - 1];
    }

    @Override
    public void remove() {
        if(isEmpty()) {
            throw new RuntimeException("No se puede obtener el tope una pila vacia");
        }
        count--;
    }

    @Override
    public void add(T value) {
        if(this.count == MAX) {
            throw new RuntimeException("La pila esta llena");
        }
        this.array[this.count] = value;
        this.count++;
    }

    @Override
    public boolean isEmpty() { // C
        return this.count == 0; // C
    }
}
