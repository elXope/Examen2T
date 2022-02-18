import java.util.ArrayList;

public class Persona {
    // Atributos de objeto
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private String domicilio;

    // Atributo de clase
    private static ArrayList<String> personas;

    // Constructores
    public Persona() {
        this.nombre = "Maria";
        this.edad = 25;
        personas.add(this.nombre);
    }

    public Persona(String nombre, String apellidos, int edad, String dni, String domicilio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.domicilio = domicilio;
        personas.add(this.nombre);
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public String getDomicilio() {
        return domicilio;
    }
}
