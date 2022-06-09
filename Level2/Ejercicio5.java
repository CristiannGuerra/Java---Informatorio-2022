import java.util.ArrayList;
import java.util.Arrays;

// Dados 2 arrayList que contienen horas-trabajadas (array1) y
// valor-por-hora(array2) del resumen de carga de horas semanal de un 
// empleado. Se debe generar otra lista que contenga los totales y luego 
// imprimir el total final a cobrar

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> wh = new ArrayList<Integer>(Arrays.asList(6, 7, 8, 4, 5));
        ArrayList<Integer> mph = new ArrayList<Integer>(Arrays.asList(350, 345, 550, 600, 320));
        System.out.println(parcialWeek(wh, mph));
        System.out.printf("Total Final a cobrar: $ %s", totalWeek(parcialWeek(wh, mph)));
    }

    public static ArrayList<Integer> parcialWeek(ArrayList<Integer> listHours, ArrayList<Integer> listSalary) {
        ArrayList<Integer> salaryPerDay = new ArrayList<Integer>();
        for (int i = 0; i < listHours.size(); i++) {
            int intHour = listHours.get(i);
            int intSalary = listSalary.get(i);
            salaryPerDay.add(intHour * intSalary);
        }
        return salaryPerDay;
    }

    public static int totalWeek(ArrayList<Integer> intList) {
        int total = 0;
        for (int i = 0; i < intList.size(); i++) {
            total += intList.get(i);
        }
        return total;
    }
}
