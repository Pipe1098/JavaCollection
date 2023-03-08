public class Ejercicio1 {

    // método maximaDiferencia que recibirá un array a de enteros y calculará la máxima diferencia para ese array.
    // Si no puede calcular la máxima diferencia (por ejemplo, si a esta en orden descendente) retornará -1

    public static int maximaDiferencia(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    if (max < a[j] - a[i]) {
                        max = a[j] - a[i];
                    }
                }
            }
        }
        if (max != 0) {
            System.out.println("La máxima diferencia en el array es:");
            return max;
        }
        return -1;
    }

    public static void main(String[] args) {

        // probamos el codigo para los dos casos.
        int[] a = { 15, 3, 6, 10 };
        int[] b = { 5, 4, 3, 2 };
        int max1 = maximaDiferencia(a);
        int max2 = maximaDiferencia(b);
        System.out.println(max1);
        System.out.println(max2);

    }
}