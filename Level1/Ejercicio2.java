import java.util.Scanner;

// Realizar un programa que solicite por consola 2 numeros enteros. Para luego
//imprimir el resultado d e la suma, resta, multiplicacion, division y modulo(resto
//de la division) de ambos numeros.

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero entero: ");
        int num1 = scan.nextInt();
        System.out.println("Por favor ingrese un segundo numero entero: ");
        int num2 = scan.nextInt();
        scan.close();
        calculate(num1, num2);

    }

    public static void calculate(int num1, int num2) {
        int sum = num1 + num2;
        int sus = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;
        System.out.printf("%s + %s = %s\n", num1, num2, sum);
        System.out.printf("%s - %s = %s\n", num1, num2, sus);
        System.out.printf("%s * %s = %s\n", num1, num2, mult);
        System.out.printf("%s / %s = %s\n", num1, num2, div);
        System.out.printf("%s %s %s = %s\n", num1, '%', num2, mod);
    }
}
