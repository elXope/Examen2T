import java.util.ArrayList;

public class Persona {
    // Atributos de objeto
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private String domicilio;

    // Atributo de clase
    private static ArrayList<Persona> personas = new ArrayList<>();

    // Constructores
    private Persona() {
        this.nombre = "Maria";
        this.edad = 25;
    }

    private Persona(String nombre, String apellidos, int edad, String dni, String domicilio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.domicilio = domicilio;
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

    // Static methods
    public static ArrayList<Persona> getPersonas() {
        return personas;
    }

    public static Persona creaPersona() {
        Persona persona = new Persona();
        personas.add(persona);
        return persona;
    }

    public static Persona creaPersona(String nombre, String apellidos, int edad, String dni, String domicilio) {
        Persona persona = new Persona(nombre, apellidos, edad, dni, domicilio);
        personas.add(persona);
        return persona;
    }

    public static void eliminarPersona(String nom) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getNombre().equals(nom)){
                personas.remove(i);
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre +
                "\nApepllidos: " + this.apellidos +
                "\nEdad: " + this.edad +
                "\nDNI: " + this.dni +
                "\nDomiciliio: " + this.domicilio;
    }
}
