package es.bbva.bucles;

public class Principal {

    private static final float SUELDO_ALTO = 50000.00f;

    public static void main(String[] args) {
            Empleado empleados[] = new Empleado[3];

            Empleado empleado1 = new Empleado("Pepe","Soto", 30000.00f);
            empleados[0] = empleado1;

            Empleado empleado2 = new Empleado("Fran","Biel", 50000.00f);
            empleados[1] = empleado2;

            Empleado empleado3 = new Empleado("Alfred","Jaynemesis", 100000.00f);
            empleados[2] = empleado3;

            float sueldoTotal = 0.0f;

            for (Empleado empleado: empleados) {
                System.out.println(empleado.getNombre());
                System.out.println(empleado.getApellidos());
                sueldoTotal = sueldoTotal + empleado.getSueldo();

                if(empleado.getSueldo() > SUELDO_ALTO){
                    System.out.println("El empleado " + empleado.getNombre() + " tiene un sueldo muy alto");
                } else {
                    System.out.println("El empleado " + empleado.getNombre() + " tiene un sueldo bajo");
                }
            }

            System.out.println("El sueldo total de todos los empleados es " +
                    sueldoTotal);
    }
}
