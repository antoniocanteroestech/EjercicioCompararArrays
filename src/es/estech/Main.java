package es.estech;

public class Main {

    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] b = {1,2,3};
        //aquí habría que crear el resto de los arrays del ejercicio




        boolean sonIguales = true; // inicializo la variable sonIguales para controlar el estado de la comparación
        if (a.length == b.length) { // primero comparo las longitudes, si son iguales sigo comprobando
            for (int i = 0; i < a.length; i++){ //recorro uno de los arrays, me da igual cual, ya que son de igual tamaño
                if (a[i] != b[i]){ // comparo los valores que hay en cada posición de los arrays (0 con 0, 1 con 1, etc...)
                                    // sin son distintos entonces entra en el if
                    sonIguales = false; // y cambio el valor de sonIguales a false
                    break;              // ya no necesito seguir comparando el resto de los arrays, con break salgo del bucle
                }
            }
        }
        else { // de la comparación de longitudes, si son distintas, ya no comparo más, los arrays no pueden ser iguales
            sonIguales = false;
        }

        System.out.println("Los arrays son iguales?: " + sonIguales); //saco por pantalla el resultado de la comparación


        //el ejercicio funciona para 2 arrays definidos dentro del main, ahora queremos sacar la lógica fuera en una método
        //de tal modo que con una llamada a ese método, podamos hacer la comparación de cualquier par de arrays que pasemos como parámetro
    }
}
