package ListaEnlazada;

public class LMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();

        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);
        linkedlist.add(5);

        System.out.println("La lista es: ");
        linkedlist.imprimir();

        linkedlist.remove(4);
        linkedlist.remove(2);


        System.out.println("set:  " + linkedlist.set(0, null));
        System.out.println("get: " + linkedlist.get(3));
        System.out.println("El elemento contiene un 15? " +linkedlist.contains(15));
        System.out.println("Esta vacio?  " + linkedlist.isEmpty());
        System.out.println("El tamaño del arreglo es: " + linkedlist.size());
        linkedlist.clear();
        System.out.println("El tamaño del arreglo es: " + linkedlist.size());
        linkedlist.imprimir();

    }
}
