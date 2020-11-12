import java.util.Scanner;

public class Ejercicio7MejorandoEjercicio2 {
    public static void main(String[] args){
        boolean seguir=true;
        while (seguir) {
            mostrarNumero();
            seguir=isSeguir();
        }
    }
    public static void mostrarNumero(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int nro =scan.nextInt();
        scan.close();
        System.out.println("El numero ingresado es: "+nro);
    }
    public static boolean isSeguir(){
        Scanner scan= new Scanner(System.in);
        System.out.println("S/N para ingresar otro numero.");
        String opcion=scan.next();
        scan.close();
        opcion.toLowerCase();
        boolean seguir =(opcion == "s")?true:false;
        return seguir;
    }
}
