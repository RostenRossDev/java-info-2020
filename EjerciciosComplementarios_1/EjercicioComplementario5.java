import java.util.Scanner;

public class EjercicioComplementario5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int nro1 = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int nro2 = sc.nextInt();
        sc.close();

        int mult = 0;
        for (int i = 0; i < nro1; i++) {
            mult +=nro2; 
        }

        System.out.println("La multiplicaion de "+nro1+" * "+nro2+" = "+mult);
    }
}
