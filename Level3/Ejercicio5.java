import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Se posee una Lista con objetos de clase Alumno con los atributos: apellido,
// nombre y fechaDeNacimiento (con tipos: String, String y LocalDate). Se desea
// generar un Map<String, Integer> donde la clave de Map será el apellido
// concatenado con el nombre (con separador de espacio en blanco) y el value la
// edad del alumno.
//      ● La lista de entrada debe estar cargada con varios alumnos (al menos 5)
//        para subir el ejemplo y demostrar su funcionamiento.
//      ● En ejemplo se muestra solo con 1 Alumno a modo de abreviar
//      ● En el ejemplo también se usa LocalDate.now().minusYears(30), en el
//        ejercicio a presentar se deberá usar otra tecnica de construcción para la
//        fecha (no usar .now(). Pueden ver métodos .parse(), etc)

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(new Alumno("Parker", "Peter", LocalDate.parse("1962-08-15")),
                new Alumno("Wilson", "Wade", LocalDate.parse("1991-09-01")),
                new Alumno("Summers", "Scott", LocalDate.parse("1963-09-13")),
                new Alumno("Rand", "Danny", LocalDate.parse("1970-05-20")),
                new Alumno("Blaze", "Johnathon", LocalDate.parse("1972-05-05")));
        Map<String, Integer> alumnosMap = alumnos.stream()
                .collect(Collectors.toMap((x) -> x.getFullName(), (x) -> x.getBirthday()));
        System.out.println(alumnosMap);
    }
}

class Alumno {
    String apellido;
    String nombre;
    LocalDate fechaDeNacimiento;

    public Alumno(String apellido, String nombre, LocalDate fechaDeNacimiento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFullName() {
        return apellido + " " + nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public int getBirthday() {
        LocalDate today = LocalDate.now();
        LocalDate birthday = fechaDeNacimiento;
        return Period.between(birthday, today).getYears();
    }

    @Override
    public String toString() {
        return apellido + " " + nombre + " " + fechaDeNacimiento;
    }

}
