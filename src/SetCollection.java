import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {

    public static void main(String[] args) {
        //crear
        Set<String> vocales = new HashSet<>();
        // agregar elementos
        vocales.add("A");
        vocales.add("E");
        vocales.add("I");
        vocales.add("O");
        vocales.add("U");
        // AGREGAR REPETIDO
        vocales.add("A");
        // tamano
        int tamano = vocales.size();
        //recorter
        for (Iterator<String> vocal = vocales.iterator(); vocal.hasNext();) {
            String v = vocal.next();
            System.out.println(v);
        }
    }
}
