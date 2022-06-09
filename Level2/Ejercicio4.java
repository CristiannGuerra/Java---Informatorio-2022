import java.util.ArrayList;

// Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
// en 3 cursos (3 arrayList) e imprimir dichos cursos.

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> mainCourse = new ArrayList<String>();
        mainCourse = createCourse();
        ArrayList<String> course1 = new ArrayList<String>(mainCourse.subList(0, 4));
        ArrayList<String> course2 = new ArrayList<String>(mainCourse.subList(4, 8));
        ArrayList<String> course3 = new ArrayList<String>(mainCourse.subList(8, 12));
        System.out.printf("el curso 1 esta conformado por los estudiantes %s \n", course1);
        System.out.printf("el curso 2 esta conformado por los estudiantes %s \n", course2);
        System.out.printf("el curso 3 esta conformado por los estudiantes %s \n", course3);
    }

    public static ArrayList<String> createCourse() {
        ArrayList<String> course = new ArrayList<String>();
        course.add("Victorino Pascual");
        course.add("Víctor Valles");
        course.add("César Sanjuan");
        course.add("Mara Barcelo");
        course.add("Toni Noguera");
        course.add("Juan-Luis Montoro");
        course.add("Claúdia Moron");
        course.add("Maria-Josefa Saiz");
        course.add("Gabriel Gallego");
        course.add("Israel Rodrigues");
        course.add("Concepcio Bustos");
        course.add("António Macias");
        return course;
    }
}
