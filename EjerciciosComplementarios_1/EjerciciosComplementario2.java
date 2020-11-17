import java.util.Scanner;

public class EjerciciosComplementario2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int nro1= sc.nextInt();
        System.out.print("Ingrese otro numero: ");
        int nro2= sc.nextInt();
        sc.close();

        System.out.println("La suma de ambos es : "+nro1+" + "+nro2+" = "+(nro1+nro2));
        System.out.println("La resta de ambos es : "+nro1+" - "+nro2+" = "+(nro1-nro2));
        System.out.println("La multiplicacion de ambos es : "+nro1+" * "+nro2+" = "+(nro1 * nro2));
        System.out.println("La division de ambos es : "+nro1+" / "+nro2+" = "+(nro1 / nro2));
        System.out.println("El modulo de ambos es : "+nro1+" % "+nro2+" = "+(nro1 % nro2));

    }
}
