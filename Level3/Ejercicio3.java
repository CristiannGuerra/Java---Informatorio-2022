import java.util.List;

// Se dispone de una lista de Strings, de la cual saber la cantidad de valores que
// comiencen con la letra B (tanto mayúscula como minúscula, en ese caso
// decimos que será ignoreCase).

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        long total = palabras.stream().filter(x -> "b".equalsIgnoreCase(x.substring(0, 1))).count();
        System.out.println(total);
    }
}
