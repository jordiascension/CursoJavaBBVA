package es.bbva.bucles;

public class Empleado {

    private String nombre;
    private String apellidos;
    private float sueldo;

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public float getSueldo() {
        return sueldo;
    }

    //Constructor
    public Empleado(String nombre, String apellidos, float sueldo)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldo = sueldo;
    }
}
