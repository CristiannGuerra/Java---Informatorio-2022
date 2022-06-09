import java.util.Scanner;

// Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente
//mensaje: "HOLA {USUARIO}!!!"

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Por favor ingrese su nombre de usuario: ");
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        System.out.printf("HOLA %s!!!", username);
        scan.close();
    }
}
