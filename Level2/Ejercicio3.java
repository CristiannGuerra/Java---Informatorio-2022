import java.util.ArrayList;
import java.util.Collections;

// Crear una lista que contenga como elementos la numeracion de cartas de una
// baraja francesa (solo los valores, no figuras). Se debera cargar el ArrayList (en
// orden), imprimir, imprimir en orden inverso(reverse), desordenar(mezclar), el 
// arrayList y volver a imprimir.

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList = createDeck();
        System.out.println(intList);
        Collections.reverse(intList);
        System.out.println(intList);
        Collections.shuffle(intList);
        System.out.println(intList);
    }

    public static ArrayList<Integer> createDeck(){
        ArrayList<Integer> intList = new ArrayList<Integer>();
        for(int i = 1; i < 53; i++){
            intList.add(i);
        }
        return intList;
    }
}