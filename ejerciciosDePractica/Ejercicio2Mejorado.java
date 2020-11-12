import java.util.Scanner;

public class Ejercicio2Mejorado {
    public static void main(String[] args){
        boolean seguir=true;
        Scanner scan= new Scanner(System.in);

        while (seguir) {
            System.out.println("Ingrese un numero: ");
            int nro =scan.nextInt();
            System.out.println("El numero ingresado es: "+nro);
            System.out.println("S/N para ingresar otro numero.");
            String opcion=scan.next();
            opcion.toLowerCase();
            seguir =(opcion == "s")?true:false;
            System.out.println("seguir: "+seguir);
        }
        scan.close();
    }
}
