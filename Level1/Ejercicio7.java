import java.util.Scanner;

// Realiza un programa que dado un String de entrada en minusculas lo
//convierta por completo a mayusculas. Sin uso de metodos o librerias que
//realicen toUppercase().

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese lo que desee convertir a mayusculas: ");
        String str = scan.nextLine();
        System.out.println(uppercase(str));
        scan.close();
    }

    public static String uppercase(String str) {
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (Character.isLowerCase(character)) {
                word.append((char) (character - 32));
            } else {
                word.append(character);
            }
        }
        return word.toString();
    }
}
