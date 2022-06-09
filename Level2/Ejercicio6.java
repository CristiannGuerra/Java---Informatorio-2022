import java.util.HashMap;
import java.util.HashSet;

// Se dispone de una coleccion de Empleados, de cada empleado se conoce:
// Nombre y Apellido, DNI, horasTrabajadas, valorPorHora.
// Todos los empleados estan caragados en un Set (HashSet), se desea calcular el
// sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
// almacenar en un Map (o Diccionario) donde la clave (key) es eldni y el valor
// (value) es el sueldo calculado.

public class Ejercicio6 {
    public static void main(String[] args) {
        HashSet<Empleado> setEmpleados = new HashSet<Empleado>();
        setEmpleados.add(new Empleado("Inez Jackson", 180305165, 80, 100));
        setEmpleados.add(new Empleado("Christine Jewett", 915479631, 80, 200));
        setEmpleados.add(new Empleado("Silvester Newton", 105724695, 120, 200));
        setEmpleados.add(new Empleado("Landon Sims", 157210626, 100, 250));
        setEmpleados.add(new Empleado("David Neely", 200942637, 50, 150));
        HashMap<Integer, Integer> mapEmpleados = new HashMap<Integer, Integer>();
        for (Empleado empleado : setEmpleados) {
            mapEmpleados.put(empleado.dni, (empleado.horasTrabajadas * empleado.valorPorHora));
        }
        for(Integer dni : mapEmpleados.keySet()){
            System.out.printf("Para el empleado con el numero de dni %s deberan pagarse $%s\n",dni ,mapEmpleados.get(dni));
        }
    }
}

class Empleado {
    String nombreYApellido;
    int dni;
    int horasTrabajadas;
    int valorPorHora;

    public Empleado(String nombreYApellido, int dni, int horasTrabajadas, int valorPorHora) {
        this.nombreYApellido = nombreYApellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        return nombreYApellido + " " + dni + " " + horasTrabajadas + " " + valorPorHora;
    }
}
