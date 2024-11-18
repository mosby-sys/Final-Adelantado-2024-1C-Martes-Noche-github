package org.example.adt;

public interface Stack<T> {

    /**
     * Precondición: La pila no puede estar vacía
     * @return Obtener el elemento de la parte superior
     */
    T getTop();

    /**
     * Precondición: La pila no puede estar vacía
     */
    void remove();
    void add(T value);
    boolean isEmpty();

}
