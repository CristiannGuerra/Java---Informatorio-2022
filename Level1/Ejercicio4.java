import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero para saber su factorial: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        factorial(num);
        scan.close();
    }

    public static void factorial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++){
            res *= i;
        }
        System.out.printf("El factorial de %s es: %s", num, res);
    }
}
