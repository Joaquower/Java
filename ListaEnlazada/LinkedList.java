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

    public T remove2(int index){
        
        return null;
    }

    public T get(int index){
        return null;
    }

    public T set(int index, T element){
        return null;
    }

    public int size(){
        return 2;
    }

    public boolean isEmpty(){
        return true;
    }

    public boolean contains(T element){
        return true;
    }

    public void clear(){

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
