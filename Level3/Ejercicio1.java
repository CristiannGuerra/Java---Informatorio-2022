import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Dada una lista que contiene valores de tipo String, se deberá filtrar todos los
// valores que NO sean null o vacío ("").

class Ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        List<String> filterPalabras = palabras.stream()
        .filter(x -> x != null && x.length() > 1)
        .collect(Collectors.toList());
        System.out.println(filterPalabras);
    }
}