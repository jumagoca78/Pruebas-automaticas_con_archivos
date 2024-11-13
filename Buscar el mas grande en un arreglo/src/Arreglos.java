public class Arreglos {
    
//funcion que logra buscar el entero mas grande en un arreglo
public static int buscarMaximo(int[] arreglo) {
    int maximo = Integer.MIN_VALUE;
    if (arreglo.length==0){
        throw new IllegalArgumentException("El arreglo no puede estar vacio");
    }
    for (int i = 0; i <= arreglo.length-1; i++) {
        if (arreglo[i] > maximo) {
            maximo = arreglo[i];
        }
    }
    return maximo;
    }

    //funcion que logra buscar el entero mas pequeños en un arreglo
public static int buscarMinimo(int[] arreglo) {
    int minimo = Integer.MAX_VALUE;
    if (arreglo.length==0){
        throw new IllegalArgumentException("El arreglo no puede estar vacio");
    }
    for (int i = 0; i <= arreglo.length-1; i++) {
        if (arreglo[i] < minimo) {
            minimo = arreglo[i];
        }
    }
    return minimo;
    }
}
