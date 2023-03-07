import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCollection {

    public static void main(String[] args) {
        // crear el array
        List<String> palabras = new ArrayList<>();
        //agregar elementos
        palabras.add("hola");
        palabras.add("camion");
        palabras.add("planta");
        //validar elementos.
        boolean contienePalabra = palabras.contains("hola");
        //Eliminar elementos
        palabras.remove("camion");
        //obtener tamano
        int tamano = palabras.size();
        // con for normal
        for (int i = 0; i < palabras.size(); i++) {
            String palabra = palabras.get(i);
            System.out.println(palabra);
        }
        // for each
        for (String palabra: palabras) {
            System.out.println(palabra);
        }
        // iterador
        Iterator iterator = palabras.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // lambdas
        palabras.stream().forEach(c -> System.out.println(c));


    }
}
