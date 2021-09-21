package Persona;

public class Persona {
    private String nombre;
    private String apellidos;
    private Integer DNI;
    private Integer Edad;

    public String getNombre()
    {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Integer getDNI() {
        return DNI;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public void setEdad(Integer edad) {
        this.Edad = edad;
    }



}
