import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Crear una funcion que dado 2 argumentos (int, siendo el primero menor al
// segundo), nos devuelva un array de Strings. Con la secuandcia de numeros
// enteros de principio a final. Pero si el numero es multiplo de 2 colocara el valor
//"Fizz", si es multiplo de 3 "Buzz" y si es a la vez multiplo de ambos colocara 
//"FizzBuzz".
//Observacion: los 2 argumentos indican con que valor se arranca a calcular y el
//segundo con que valor debe frenar (no se incluyen en el calculo).
//Ejemplo: (1,5) -----> calculara valores de 1, 2, 3, 4.

public class Ejercicio7 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        scan.close();
        ArrayList<String> strList = new ArrayList<>(FizzBuzz(num1, num2));
        System.out.println(strList);
    }

    public static ArrayList<String> FizzBuzz(int num1, int num2) {
        ArrayList<String> strList = new ArrayList<>();
        for(int i = num1; i < num2; i++){
            if( i % 2 == 0 && i % 3 == 0){
                strList.add("FizzBuzz");
            }
            else if( i % 2 == 0){
                strList.add("Fizz");
            }
            else if(i % 3 == 0){
                strList.add("Buzz");
            }
            else{
                strList.add(Integer.toString(i));
            }
        }
        return strList;
    }
}