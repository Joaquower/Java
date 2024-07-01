import java.util.Scanner;


public class prueba {
    public Persona[] Personas;
    public int contadorPersonas;
    public prueba() {
        Personas = new Persona[10]; 
        contadorPersonas = 0; 
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        prueba programa = new prueba();

        //Menu
        boolean bandera =true;
        System.out.println("Que deseas hacer?? ");
        while (bandera==true) {
            System.out.println("Porfavor selecciona una opcion: \n A) Agregar una nueva persona \n B) Seleccionar persona existente \n C) Cerrar");
            String seleccion = scanner.nextLine();
            switch (seleccion) {
                case "A":
                    programa.agregar(scanner);
                    break;
                case "B":
                    
                    break;
                case "C":
                    bandera=false;
                    break;
            
                default:
                    System.out.println("NO digitaste ninguna de las opciones, asegurate que sean mayusculas...");
                    break;
            }
        }
        //registrar personas
        //registrar prestamos
        //consultar prestamos
        //realizar pagos
        //generar informes
    }


    public class Persona{
        int capacidad_inicial = 10;
        int[] prestamo;
        String nombre;
        public Persona(String nombre, int[] prestamo){
            this.nombre = nombre;
            this.prestamo = prestamo;
        }
    }
    
    public void agregar( Scanner scanner){
        System.out.println("Porfavor ingrese el nombre de la nueva persona: ");
        String nombre = scanner.nextLine();

        int[] prestamo = new int[0];

        Persona nuevaPersona = new Persona(nombre, prestamo);

        if (contadorPersonas < Personas.length) {
            Personas[contadorPersonas] = nuevaPersona;
            contadorPersonas++;
            System.out.println("Persona agregada correctamente \n" + " su indice es: " + contadorPersonas);
        } else {
            System.out.println("No se pueden agregar más personas. Capacidad máxima alcanzada.");
        }
    }
}

