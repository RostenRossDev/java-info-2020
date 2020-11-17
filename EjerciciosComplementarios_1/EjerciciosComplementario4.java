import java.util.Scanner;

public class EjerciciosComplementario4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int nro = sc.nextInt();
        sc.close();
        int factor=1;
        for (int i = 0; i < nro; i++) {
            System.out.println("i: "+(i+1));
            factor=factor*(i+1);
            System.out.println("factor: "+factor);
        }
        System.out.println("El factor de "+nro+" es "+factor);
    }
}
