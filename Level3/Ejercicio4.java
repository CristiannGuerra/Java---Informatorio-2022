import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Se dispone de una lista de Integer, de la cual queremos obtener otra lista
// aplicando la operación de factorial pero no se desean valores repetidos.

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);
        List<Integer> cleanRep = palabras.stream().distinct().collect(Collectors.toList());
        List<Integer> res = cleanRep.stream().map(x -> factorial(x)).collect(Collectors.toList());
        System.out.println(res);
    }

    public static Integer factorial(int n) {
        return IntStream.rangeClosed(1, n).reduce(1, (int x, int y) -> x * y);
    }
}
