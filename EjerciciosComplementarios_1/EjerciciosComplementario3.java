import java.util.Scanner;

public class EjerciciosComplementario3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la piramide: ");
        int tam = sc.nextInt();
        sc.close();

        for (int i = 0; i < tam+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
            }
            System.out.println("");
        }
    }    
}
