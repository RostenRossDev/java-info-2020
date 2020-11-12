import java.util.Scanner;

public class Ejercicio4ConIf {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int dia = scan.nextInt();
        scan.close();

        if(dia == 1){
            System.out.println("Domingo");
        }else if (dia ==2){
            System.out.println("Lunes");
        }else if (dia ==3){
            System.out.println("Martes");
        }else if (dia ==4){
            System.out.println("Miercoles");
        }else if (dia ==5){
            System.out.println("Jueves");
        }else if (dia ==6){
            System.out.println("Viernes");
        }else if (dia ==7){
            System.out.println("Sabado");
        }else {
            System.out.println("El numero ingresado no corresponde con ningun dia de la semana.");
        }
    }    
}
