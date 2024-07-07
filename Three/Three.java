package Three;
import java.util.ArrayList;
import java.util.List;


public class Three<T> implements IThree<T> {

    public class Node<T>{
        T data;
        Node<T> next;
        private Node<T> parent;
        private List<Node<T>> children;
 
 
        public Node(T data) {
         this.data = data;
         this.next = null; 
         this.children = new ArrayList<>();
     }
     }

     private int size;
     Node<T> root;

    public Three(){
     this.size=0;
     this.root=null;
    }

    public boolean add(T value){
        Node<T> newnode = new Node<>(value);
        if(size == 0){
            root = newnode;
        }
        return true;
    }
    public boolean remove(T value){
        return true;
    }
    public boolean contains(T value){
        return true;
    }
    public int size(){
        return 1;
    }
    public boolean isEmpty(){
        return true;
    }
}
