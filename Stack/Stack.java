package Stack;
// Stack.java

public class Stack<T> implements IStack<T> {
    private int size;
    private int CAPACITY;
    private T[] data;

    @SuppressWarnings("unchecked")
    public Stack() {
        size = 0;
        CAPACITY = 10;
        // Inicializa el array de Object y luego realiza un cast a T[]
        data = (T[]) new Object[CAPACITY];
    }

    // Método para añadir un elemento a la pila
    @SuppressWarnings("unchecked")
    public void push(T element) {
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

    // Método para eliminar y devolver ultimo elemento agregado a la pila
    public T pop() {
       if(size == 0){
        System.out.println("No hay elemento en el arreglo que eliminar");
        return null;
       }
       T dato = data[size -1];
       data[size -1] = null;
       size--;       
       return dato;
    }

    // Método para devolver el elemento en la parte superior de la pila sin eliminarlo
    public T peek() {
       return  data[size -1];
    }

    // Método para comprobar si la pila está vacía
    public boolean isEmpty() {
        return size == 0;
    }

    // Método para obtener el tamaño de la pila
    public int getSize() {
        return size;
    }
    public void imprimir (){
        for(int i =0; i<size;i++){
            System.out.println(data[i]);
        }
    }
}
