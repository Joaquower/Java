package Queue;

public class QMain {
    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();

        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println(" arreglo: ");
        queue.imprimir();
        System.out.println("Size: " + queue.size());
        System.out.println("Arreglo vacio?  " + queue.isEmpty());

        queue.dequeue();
        queue.dequeue();
        queue.imprimir();
        queue.size();
        queue.isEmpty();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.size();
       System.out.println("Arreglo vacio?  " + queue.isEmpty());

    }
}
