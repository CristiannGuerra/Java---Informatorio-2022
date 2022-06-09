import java.util.Scanner;

// Crear una aplicacion que solicite de entrada los datos de una persona en este orden:
// Nombre y Apellido, Edad, Direccion, Ciudad.

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su nombre completo: ");
        String fullName = scan.nextLine();
        System.out.println("Ingrese su edad: ");
        String age = scan.nextLine();
        System.out.println("Ingrese su direccion: ");
        String address = scan.nextLine();
        System.out.println("Ingrese la ciudad donde habita: ");
        String city = scan.nextLine();
        Persona human1 = new Persona(fullName, age, address, city);
        System.out.print(human1.toString());
        scan.close();
    }
}

class Persona {
    String fullName;
    String age;
    String address;
    String city;

    public Persona(String fullName, String age, String address, String city) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.city = city;
    }

    @Override
    public String toString() {
        return city + " - " + address + " - " + age + " - " + fullName;
    }
}
