import java.util.Scanner;
public class CaracterRep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Porfavor escribe algo: ");
        String cadena = scanner.nextLine();
        System.out.println("Cual caracter quieres ver cuantas veces se repite??: ");
        char caracter = scanner.next().charAt(0);
        scanner.close();

        for(int  i=0; i < cadena.length(); i++){
            if(cadena.charAt(i) == caracter){
                count++;
            }
        }
        System.out.println(count);
    }
}
