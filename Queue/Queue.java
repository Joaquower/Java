package Queue;

public class Queue<T> implements IQueue<T> {

    private int CAPACITY;
    private int size;
    private T[] data;

    @SuppressWarnings("unchecked")
    public Queue(){
        CAPACITY = 10;
        size = 0;
        data = (T[]) new Object[CAPACITY];
    }
    @SuppressWarnings("unchecked")
    public void enqueue(T element){
        if (size == CAPACITY) {
            System.out.println("La pila está llena, redimensionando...");
            CAPACITY *= 2;
            T[] newData = (T[]) new Object[CAPACITY];
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[size] = element;
        size++;
    }
    @SuppressWarnings("unchecked")
    public T dequeue(){
        if(isEmpty()){
            return null;
        }
        T dato = data[0];
        for(int i=0; i<0;i++){
            data[i] = data[i+1];
        }
        T[] newData = (T[]) new Object[CAPACITY];
        if(size > CAPACITY/2){
            for(int i =0;i<size;i++){
                newData[i] = data[i];
            }
            data = newData;
        }
        size--;
        return dato;
    }
    public T front(){
        T dato = data[0];
        return dato;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }

    public void imprimir(){
        for(int i=0; i<size; i++){
            System.out.println(data[i] + "  ");
        }
    }
}
