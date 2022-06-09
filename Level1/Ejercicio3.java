import java.util.Scanner;

// Confeccionar un programa que dado un numero entero como dato de entrada
//imprima la secuencia de numeros (incrementos de 1) de la siguiente forma:

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero: ");
        int num = scan.nextInt();
        loop(num);
        scan.close();
    }

    public static void loop(int num) {
        for (int i = 0; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
