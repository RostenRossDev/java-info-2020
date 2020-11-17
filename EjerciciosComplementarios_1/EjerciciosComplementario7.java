import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjerciciosComplementario7 {
    public static void main(String[] args) {
        Map<Character, Character> letras = new HashMap<>();
        letras.put('a', 'A');
        letras.put('b', 'B');
        letras.put('c', 'C');
        letras.put('d', 'D');
        letras.put('e', 'E');
        letras.put('f', 'F');
        letras.put('g', 'G');
        letras.put('h', 'H');
        letras.put('i', 'I');
        letras.put('j', 'J');
        letras.put('k', 'K');
        letras.put('l', 'L');
        letras.put('m', 'M');
        letras.put('n', 'N');
        letras.put('o', 'O');
        letras.put('p', 'P');
        letras.put('q', 'Q');
        letras.put('r', 'R');
        letras.put('s', 'S');
        letras.put('t', 'T');
        letras.put('u', 'U');
        letras.put('v', 'V');
        letras.put('w', 'W');
        letras.put('x', 'X');
        letras.put('y', 'Y');
        letras.put('z', 'Z');
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = sc.nextLine();
        sc.close();
        String mayuscula ="";
            
        for (int i = 0; i < palabra.length(); i++) {
            Character letra=palabra.charAt(i);
            if (letras.containsKey(letra)){
                mayuscula=mayuscula.concat(letras.get(letra).toString());            
            }else{
                mayuscula=mayuscula.concat(letra.toString());
            }
        }
        System.out.println("La palabra ingresada en mayuscula: ".concat(mayuscula));
    }
}
