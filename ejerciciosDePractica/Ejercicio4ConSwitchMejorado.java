import java.util.Scanner;

public class Ejercicio4ConSwitchMejorado {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean seguir= true;
        while (seguir){ 
            int dia = scan.nextInt();
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
            System.out.println("¿Desea ingresar otro numero? S/N");
            String opcion = scan.next();
            opcion.toLowerCase();
            Character charOp= opcion.charAt(0);
            seguir = (charOp == 's')?true:false;
        }
        scan.close();

    }
}
