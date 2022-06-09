import java.util.Scanner;

// Se desea una aplicacion que solicite 2 numeros enteros y realice la operacion
//de multiplicacion por sumas sucesivas (sin uso de librerias).

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero entero para ser multiplicado: ");
        int num1 = scan.nextInt();
        System.out.println("Ingrese un segundo numero entero para ser multiplicado: ");
        int num2 = scan.nextInt();
        mult(num1, num2);
        scan.close();
    }

    public static void mult(int num1, int num2) {
        int total = 0;
        for (int i = 1; i <= num2; i++) {
            total = total + num1;
        }
        System.out.printf("%s x %s = %s", num1, num2, total);
    }
}