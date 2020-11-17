import java.util.Scanner;

public class EjerciciosComplementario6 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int nro1 = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int nro2 = sc.nextInt();
        sc.close();
        int potencia = 1;
        for (int i = 0; i < nro2; i++) {
            potencia *=nro1;
            System.out.println("Potencia parcial: "+potencia);
        }

        System.out.println("La pontecia: "+nro1+" ^ "+nro2+" = "+potencia);
    }
}
