package scholar;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Scholar {

    public static void main(String[] args) {
        // Fernando Oliveros Ocampo.

        Empleado empleado1 = new Empleado();

        empleado1.nombre = "Fernando Antonio";
        empleado1.apellidos = " Oliveros Ocampo";
        empleado1.fecha_nacimiento = "22-03-2001";
        empleado1.genero = " Masculino";
        empleado1.identificación = "1001865500";
        //empleado1.calcEdad();
        //System.out.println("El empleado se llama " + empleado1.nombre + empleado1.apellidos);
        System.out.println("Su fecha de nacimiento es " + empleado1.fecha_nacimiento);
        empleado1.printName();
        System.out.println("Su genero es" + empleado1.genero);
        System.out.println("Su numero de identificación es " + empleado1.identificación);
        System.out.println("la edad es " + empleado1.calcEdad());
        Estudiante estudiante1 = new Estudiante();

        System.out.println("--------------- DATOS ESTUDIANTES---------------");

        estudiante1.nombre = "Fernando Antonio";
        estudiante1.apellidos = " Oliveros Ocampo";
        estudiante1.fecha_nacimiento = "22-03-2001";
        estudiante1.genero = " Masculino";
        estudiante1.identificación = "1001865500";

        //System.out.println("El estudiante tiene por nombre " + estudiante1.nombre +estudiante1.apellidos);
        estudiante1.printName();
        System.out.println("Su fecha de nacimiento es " + estudiante1.fecha_nacimiento);
        System.out.println("Su genero es" + estudiante1.genero);
        System.out.println("Su numero de identificación es " + estudiante1.identificación);

        Persona periodo = Persona.between(2019, 2001);
        //fecha_nacimiento (22/03/2001);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("22/03/2001");
        LocalDate fecha_nacimiento = LocalDate.parse("22/03/2001", fmt);
        LocalDate año_actual = LocalDate.now();
       
        periodo.getDays();
        periodo.getMonths();
        periodo.getYears();

        System.out.printf("Tu edad es: %s años, %s meses y %s días" + periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }

}
