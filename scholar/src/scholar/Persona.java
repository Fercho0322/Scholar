

package scholar;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Persona {

    static Persona between(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String nombre;
    public String apellidos;
    public String genero;
    public String fecha_nacimiento;
    public String tipo_sangre;
    public String nacionalidad;
    public String identificación;
    public String telefono;
    public String dirección;
    public String Año_actual;
    public String correo_electronico;
    public String Years;
    public String Months;
    public String Days;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAño_actual() {
        return Año_actual;
    }

    public void setAño_actual(String Año_actual) {
        this.Año_actual = Año_actual;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getIdentificación() {
        return identificación;
    }

    public void setIdentificación(String identificación) {
        this.identificación = identificación;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }
    
   public void printName(){
   
       System.out.println(this.nombre +""+ this.apellidos);
   
   
   } 

    public String getYears() {
        return Years;
    }

    public void setYears(String Years) {
        this.Years = Years;
    }

    public String getMonths() {
        return Months;
    }

    public void setMonths(String Months) {
        this.Months = Months;
    }

    public String getDays() {
        return Days;
    }

    public void setDays(String Days) {
        this.Days = Days;
    }

   public int calcEdad(){
    return 18;
   }
    
  
  
     
    
   
  


   
}
