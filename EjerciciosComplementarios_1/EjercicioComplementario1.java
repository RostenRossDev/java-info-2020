import java.util.Scanner;

public class EjercicioComplementario1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = sn.nextLine();
        sn.close();
        System.out.println("Hola ".concat(nombre));
    }
}
