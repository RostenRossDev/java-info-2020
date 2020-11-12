import java.util.Scanner;

public class Ejercicio5Mejorado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nro= scan.nextInt();
        scan.close();
        int numero=1;
        while (numero<11) {
            System.out.println(nro+" * "+numero+" = "+nro*numero);
            numero++;
        }
       
    }
}
