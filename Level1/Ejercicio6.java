import java.util.Scanner;

// Se desea una aplicacion que solicite 2 numeros enteros y realice la operacion
//de potencia (sin uso de librerias).

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora de potencias");
        System.out.println("Por favor ingrese la base para la potencia:  ");
        int num1 = scan.nextInt();
        System.out.println("Ahora ingrese el exponente deseado:  ");
        int num2 = scan.nextInt();
        potencia(num1, num2);
        scan.close();
    }

    public static void potencia(int num1, int num2) {
        int total = 1;
        for(int i = 1; i <= num2; i++){
            total = num1 * total;
        }
        System.out.printf("%s elevado a %s = %s", num1, num2, total);
    }
}