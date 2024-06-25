package ListaEnlazada;
public interface ILinkedList<T> {

    void add(T element);

    void add(int index, T element) throws IndexOutOfBoundsException;

    boolean remove(T element);

    T remove(int index) throws IndexOutOfBoundsException;

    T get(int index) throws IndexOutOfBoundsException;

    T set(int index, T element) throws IndexOutOfBoundsException;

    int size();

    boolean isEmpty();

    boolean contains(T element);

    void clear();
}
