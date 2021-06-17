package es.bbva.ada;

public class Persona {
    private String nombre;
    private String apellidos;
    private float base;
    private float plan;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setPlan(float plan) {
        this.plan = plan;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public float getBase() {
        return base;
    }

    public float getPlan() {
        return plan;
    }

    public Persona(String nombre, String apellido, float base, float plan)
    {
        this.apellidos = apellido;
        this.nombre = nombre;
        this.base = base;
        this.plan = plan;
    }

    public Persona(){

    }
}
