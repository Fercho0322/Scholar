
package scholar;


public class Scholar {

    
    public static void main(String[] args) {
        // Fernando Oliveros Ocampo.
        
        Empleado empleado1 = new Empleado();
        
        empleado1.nombre = "Fernando Antonio";
        empleado1.apellidos = " Oliveros Ocampo";
        empleado1.fecha_nacimiento = "22-03-2001";
        empleado1.genero = " Masculino";
        empleado1.identificación = "1001865500";
               
        //System.out.println("El empleado se llama " + empleado1.nombre + empleado1.apellidos);
        System.out.println("Su fecha de nacimiento es " + empleado1.fecha_nacimiento);
        empleado1.printName();
        System.out.println("Su genero es" + empleado1.genero);
        System.out.println("Su numero de identificación es " + empleado1.identificación);
        
        Estudiante estudiante1 = new Estudiante();
        
        estudiante1.nombre = "Fernando Antonio";
        estudiante1.apellidos= " Oliveros Ocampo";
        estudiante1.fecha_nacimiento = "22-03-2001";
        estudiante1.genero = " Masculino";
        estudiante1.identificación = "1001865500";
        
        //System.out.println("El estudiante tiene por nombre " + estudiante1.nombre +estudiante1.apellidos);
        estudiante1.printName();
        System.out.println("Su fecha de nacimiento es " + estudiante1.fecha_nacimiento);
        System.out.println("Su genero es" + estudiante1.genero);
        System.out.println("Su numero de identificación es " + estudiante1.identificación);    
    
    
    }
    
}
