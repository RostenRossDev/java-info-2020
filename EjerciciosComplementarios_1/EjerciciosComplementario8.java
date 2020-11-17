import java.util.Scanner;

public class EjerciciosComplementario8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        nombre = nombre.substring(0,1).toUpperCase().concat(nombre.substring(1));
        System.out.println("Ingrese su edad: ");
        String edad = sc.nextLine();
        edad = edad.substring(0,1).toUpperCase().concat(edad.substring(1));
        System.out.println("Ingrese su direccion: ");
        String dire = sc.nextLine();
        dire = dire.substring(0,1).toUpperCase().concat(dire.substring(1));
        System.out.println("Ingrese su ciudad: ");
        String ciudad = sc.nextLine();
        ciudad = ciudad.substring(0,1).toUpperCase().concat(ciudad.substring(1));
        sc.close();
        System.out.println(ciudad+" - "+dire+" - "+edad+" - "+nombre);
    }
}
