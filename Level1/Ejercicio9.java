import java.util.Scanner;

// Dado un String de entrada (frase, texto, etc.) calcular la cantidad de veces que
//aparece una letra dada.

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una frase o texto: ");
        String str = scan.nextLine();
        System.out.println("Ingrese la letra que desee contabilizar: ");
        Character character = scan.next().charAt(0);
        System.out.println(howMany(str, character));
        scan.close();
    }

    public static int howMany(String str, Character character) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.toUpperCase(character) == str.toUpperCase().charAt(i)) {
                counter += 1;
            } else {
                continue;
            }
        }
        return counter;
    }
}
