import java.util.HashSet;
import java.util.Set;

//Este código verifica si existe un par de números en un arreglo que sumen K

public class Ejercicio3 {

    // Método para verificar si existe un par de números en un arreglo que sumen K
    public static boolean existeParConSumaK(int[] A, int K) {
        Set<Integer> s = new HashSet<Integer>(); // Crea un nuevo conjunto vacío

        for (int i = 0; i < A.length; i++) { // Recorre el arreglo A
            int diff = K - A[i]; // Calcula la diferencia entre K y el elemento actual del arreglo A
            if (s.contains(diff)) { // Verifica si el conjunto contiene la diferencia calculada anteriormente
                return true; // Si el conjunto contiene la diferencia, devuelve true
            }
            s.add(A[i]); // Agrega el elemento actual del arreglo al conjunto
        }

        return false; // Si no se encuentra ninguna coincidencia, devuelve false
    }

    public static void main(String[] args) {
        int[] A = { 1, 3, 7 }; // Arreglo de ejemplo
        int K = 8; // Valor a buscar

        if (existeParConSumaK(A, K)) { // Llama al método para verificar si existe un par de números en el arreglo que
                                       // sumen K
            System.out.println("SI"); // Si existe tal par, imprime SI
        } else {
            System.out.println("NO");// Si no existe tal par, imprime NO
        }

    }

}
