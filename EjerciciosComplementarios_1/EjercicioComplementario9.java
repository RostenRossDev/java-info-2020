import java.util.Scanner;

public class EjercicioComplementario9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una oracion: ");
        String oracion= sc.next();
    
        System.out.println("Ingrese una letra: ");
        String caracter = sc.next();
        Character letra = caracter.charAt(0);
        sc.close();
        int cont = 0;
        System.out.println(oracion+" ///// tiene una longitud de "+oracion.length());

        for (int i = 0; i < oracion.length(); i++) {
            Character character = oracion.charAt(i);
            if (letra == character) {
                cont ++;
            }
            System.out.println("El caracter actual: "+ oracion.charAt(i));
        }
        System.out.println("La cantidad de veces que aparece la letra "+caracter+" es de "+cont);
        
        for (int i = 0; i < oracion.length(); i++) {
            System.out.println(oracion.charAt(i));
        }
    }
}
