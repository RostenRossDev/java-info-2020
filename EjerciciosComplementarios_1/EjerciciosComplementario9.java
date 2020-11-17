import java.util.Scanner;

public class EjerciciosComplementario9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese una oración: ");
        String oracion = sc.nextLine();
        System.out.println("Ingrese una letra: ");
        Character letra = sc.nextLine().charAt(0);
        sc.close();
        int cont = 0;
        for (int i = 0; i < oracion.length(); i++) {
            Character puntero = oracion.charAt(i);
            if (letra == puntero){
                cont ++;
            }
        }

        System.out.println("La cantidad de letras '"+letra+"' que hay en ");
        System.out.println("'"+oracion+"' es "+cont+" veces.");

    }
}
