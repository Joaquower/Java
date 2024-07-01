package ListaEnlazada;

public class LMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();

        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);
        linkedlist.add(5);
        linkedlist.add(10);

        System.out.println("La lista es: ");
        linkedlist.imprimir();

        linkedlist.remove(4);

        System.out.println("La lista es: ");
        linkedlist.imprimir();


    }
}
