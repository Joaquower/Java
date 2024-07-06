package ListaEnlazada;
import java.util.ArrayList;

public class LinkedList<T> implements ILinkedList<T> {

    public class Nodo<T>{
       T data;
       Nodo<T> next;


       public Nodo(T data) {
        this.data = data;
        this.next = null; 
    }
    }

    private int size;
    Nodo<T> head;
    Nodo<T> tail;

    
    LinkedList(){
        size = 0;
        head = null;
        tail= null;
    }

    public void add(T element){
        Nodo<T> newnodo = new Nodo<>(element);
        if(head == null){
            head = newnodo;
            tail = newnodo;
        }
        else{
            if(tail.next == null){
                tail.next = newnodo;
                tail = newnodo;
            }
        }
        size++;
    }

    public void add(int index, T element){
        Nodo<T> newnodo = new Nodo<>(element);
        Nodo<T> current = head;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            // Insertar al inicio de la lista
            newnodo.next = head;
            head = newnodo;
            if (size == 0) {
                tail = newnodo;
            }
        }
        else{
            for(int i=0; i<index -1;i++){
                current = current.next;
            }
            newnodo.next = current.next;
            current.next = newnodo;
            if(newnodo.next == null){
                tail = newnodo;
            }
        }
        size++;
    }

    public boolean remove(T element){
        Nodo<T> current = head;
        Nodo<T> previous = null;
        if(head == null){
            return false;
        }
        else{
            while(current != null){
                previous = current;
                current = current.next;
                if(current.data.equals(element)){
                    if (previous != null) {
                        previous.next = current.next;
                        if (current.next == null) {
                            tail = previous; 
                        }
                    }
                    size--;
                    return true;
                }
            }
        }
        return false;
    }

    public T remove2(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    
        Nodo<T> current = head;
        Nodo<T> prev = null;
    
        // Si se elimina el primer nodo
        if (index == 0) {
            T data = head.data;
            head = head.next;
            return data;
        }
    
        // Avanzar a la posición del índice
        for (int i = 0; i < index; i++) {
            if (current == null || current.next == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            prev = current;
            current = current.next;
        }
    
        T data = current.data;
        prev.next = current.next; // Salta el nodo en el índice
        size--;
    
        return data;
    }

    //mostrar el elemento del indice indicado
    public T get(int index){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Nodo<T> current = head;
        for(int i=0; i<index;i++){
            current = current.next;
        }
        T dato = current.data;
        return dato;
    }

    //reemplazar en el indice marcado
    public T set(int index, T element){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Nodo<T> current = head;
        for(int i=0; i<index;i++){
            current=current.next;
        }
        current.data = element;

        return null;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size <= 0){
            return true;
        }
        return false;
    }

    public boolean contains(T element){
        Nodo<T> current = head;
        for(int i=0; i<size;i++){
            if(current.data == element){
                return true;
            }
            current = current.next;
        }
        return false;

    }

    public void clear(){
        head = null;
        size=0;
    }
    public void imprimir(){
        Nodo<T> current = head;
        int i =0;
        while (current != null) {
            i++;
            System.out.println("Dato " + i + ": " + current.data);
            current = current.next;
        }
    }
}
