import java.util.Scanner;

public class RevertirCadena {
    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena de texto
        System.out.println("Por favor, ingresa una cadena de texto:");
        String cadena = scanner.nextLine();

        // Cerrar el Scanner
        scanner.close();

        // Variable para almacenar la cadena invertida
        String newcadena = "";

        // Bucle para invertir la cadena
        for(int i = cadena.length() - 1; i >= 0; i--){
            newcadena += cadena.charAt(i);
        }

        // Mostrar la cadena invertida
        System.out.println("La cadena invertida es: " + newcadena);
    }
}
