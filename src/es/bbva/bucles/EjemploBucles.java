package es.bbva.bucles;

public class EjemploBucles {

    public static void main(String[] args) {

        int array[];
        array = new int[10];
        int i = 0;

        for (i=0; i<array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }

    }
}
