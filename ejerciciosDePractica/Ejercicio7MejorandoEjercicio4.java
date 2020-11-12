import java.util.Scanner;

public class Ejercicio7MejorandoEjercicio4 {
    public static void main(String[] args){
        boolean seguir= true;
        while (seguir){ 
           mostrarDia();
           seguir =isSeguir();
        }

    }

    public static void mostrarDia(){
        Scanner scan = new Scanner(System.in);
        int dia = scan.nextInt();
        scan.close();
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
    
            default:
                System.out.println("El numero ingresado no corresponde con ningun dia de la semana.");
                break;
        }
    }
    public static boolean isSeguir(){
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Desea ingresar otro numero? S/N");
        String opcion = scan.next();
        scan.close();
        opcion.toLowerCase();
        Character charOp= opcion.charAt(0);
        boolean seguir = (charOp == 's')?true:false;
        return seguir;
    }
}
