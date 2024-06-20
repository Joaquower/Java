package Stack;
// Main.java

public class Main {
    public static void main(String[] args) {
        // Crear una pila de enteros
        Stack<Integer> stack = new Stack<>();

        // Añadir elementos a la pila
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(80);

        // Mostrar el elemento en la parte superior de la pila
        System.out.println("Top element is: " + stack.peek());

        // Eliminar y mostrar elementos de la pila
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());

        // Mostrar el tamaño de la pila
        System.out.println("Size of stack is: " + stack.getSize());

        // Verificar si la pila está vacía
        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.imprimir();

        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Popped element is: " + stack.pop());

    }
}
