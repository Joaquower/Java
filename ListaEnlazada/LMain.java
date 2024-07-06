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
        System.out.println("El tamaño del arreglo es de: " + linkedlist.size());

        linkedlist.remove(4);

        System.out.println("La lista es: ");
        linkedlist.imprimir();
        System.out.println("El tamaño del arreglo es de: " + linkedlist.size());

        System.out.println("El elemento eliminado es: " + linkedlist.remove2(4));

        System.out.println("La lista es: ");
        linkedlist.imprimir();
        System.out.println("El tamaño del arreglo es de: " + linkedlist.size());

        System.out.println("El dato en el indice 1 es: " + linkedlist.get(0));
        System.out.println("El dato en el indice 2 es: " + linkedlist.get(1));
        System.out.println("El dato en el indice 3 es: " + linkedlist.get(2));
        System.out.println("El dato en el indice 4 es: " + linkedlist.get(3));


        linkedlist.set(0, 34);
        System.out.println("El primer elemento ha sido remplazado por un 34");

        System.out.println("La lista es: ");
        linkedlist.imprimir();
        System.out.println("El tamaño del arreglo es de: " + linkedlist.size());


        System.out.println("El arreglo esta vacio?: " + linkedlist.isEmpty());

        linkedlist.clear();
        System.out.println("La lista es: ");
        linkedlist.imprimir();
        System.out.println("El tamaño del arreglo es de: " + linkedlist.size());


        System.out.println("El arreglo esta vacio?: " + linkedlist.isEmpty());

    }
}
