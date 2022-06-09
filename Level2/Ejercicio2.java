import java.util.ArrayList;

// Ejercicio 2
// Crear un ArrayList, agregar 5 numeros enteros. Luego, agregar un numero
// entero al principio de la lista y otro al final. Por ultimo, iterar e imprimir los
// elementos de la lista y el tamanio de la misma (antes y despues de agregar a
// en la primera y ultima posicion)

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = createList();
        renderList(list);
        list.add(0, 0);
        list.add(6);
        renderList(list);
    }

    public static ArrayList<Integer> createList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 6; i++) {
            list.add(i);
        }
        return list;
    }

    public static void renderList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.printf("La lista posee %s elementos\n", list.size());
    }
}
