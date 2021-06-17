package es.bbva.ada;

public class PlanPensiones {

    public float calcularPlan(Persona persona0){

        int e=0;
        int tipo=0;
        Persona persona[] = new Persona[10];
        persona[e] = persona0;

        if(persona[e].getBase()>0 && persona[e].getBase()<12450){
            tipo = 19;
        }else if (persona[e].getBase()>12450 && persona[e].getBase()<20200){
            tipo = 24;
        }else if (persona[e].getBase()>20200 && persona[e].getBase()<35200){
            tipo = 30;
        }else if (persona[e].getBase()>35200 && persona[e].getBase()<60000){
            tipo = 37;
        }else if (persona[e].getBase()>60000&& persona[e].getBase()<300000){
            tipo = 45;
        }else{
            tipo = 47;
        }
        //el anticipo que ya hemos pagado a Hacienda.
        float deduccion = persona[e].getPlan() * tipo / 100;
        return deduccion;
    }
}
