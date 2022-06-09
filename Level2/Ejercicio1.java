import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// Ejercicio1
// Crear un ArrayList y cargarlo con tus ciudades favoriatas de Argentina, luego
// imprimir por pantalla el ranking.

public class Ejercicio1 {

    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese sus ciudades favoritas de Argentina: ");
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        String city1 = reader.readLine();
        String city2 = reader.readLine();
        String city3 = reader.readLine();
        reader.close();
        input.close();
        renderCities(favCities(city1, city2, city3));
    }

    public static ArrayList<String> favCities(String city1, String city2, String city3) {
        ArrayList<String> list = new ArrayList<>();
        list.add(city1);
        list.add(city2);
        list.add(city3);
        return list;
    }

    public static void renderCities(ArrayList<String> list) {
        System.out.printf("#1 - %s \n", list.get(0));
        System.out.printf("#2 - %s \n", list.get(1));
        System.out.printf("#3 - %s \n", list.get(2));
    }
}