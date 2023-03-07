import java.util.HashMap;
import java.util.Map;

public class MapCollection {

    public static void main(String[] args) {
        // crear un mapa
        Map<String, String> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("asdas", 12312);
        //agregar elementos
        map.put("US", "USA");
        map.put("BR", "BRAZIL");
        map.put("COL", "COLOMBIA");
        // DEVOLVER EL TAMANO
        int tamano = map.size();
        String valor = map.get("BR");
        // eliminar
        map.remove("BR");
        // contiene
        boolean key = map.containsKey("US");
        boolean value = map.containsValue("AFRICA");

        for (Map.Entry entry: map.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }

}
