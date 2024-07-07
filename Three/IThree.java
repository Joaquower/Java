package Three;
public interface IThree<T> {
    boolean add(T value);
    boolean remove(T value);
    boolean contains(T value);
    int size();
    boolean isEmpty();
}
