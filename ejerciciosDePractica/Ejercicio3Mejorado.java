import java.util.Scanner;

public class Ejercicio3Mejorado {
    
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        boolean condicion=true;
        while (condicion) {
            System.out.println("Ingrese una nota: ");
            int nota = scan.nextInt();
        
            if (nota>92){
                System.out.println("Excelente");
            }else if (nota >84){
                System.out.println("Sobresaliente");
            }else if (nota >74){
                System.out.println("Distinguido");
            }else if (nota >59){
                System.out.println("Bueno");
            }else{
                System.out.println("Desaprobado");
            }        
            System.out.println("¿desea ingresar otra nota? S/N");
            String opcion;
            opcion = scan.next();
            opcion = opcion.toLowerCase();
            Character charOp = opcion.charAt(0);
           
            condicion=(charOp == 's')?true:false;
        }

        scan.close();
        
    }
}
