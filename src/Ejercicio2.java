import java.util.Scanner;
import java.util.HashMap;

public class Ejercicio2 {

    /*
Implementa el control de acceso para una empresa de seguridad información . Se debe pedir
un nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente, el
programa dirá "Ha accedido aceptado". El usuario tendrá un máximo de 4 oportunidades. Si se
agotan las oportunidades el programa dirá "Lo siento, no tiene acceso al área restringida". Los
nombres de usuario con sus correspondientes contraseñas que son permitidas deben estar
almacenados en una estructura de la clase HasMap. 
     */

    public static void login() {

        // Generar 10 pares clave-valor
        HashMap<String, String> map = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            String key = "nombre_" + i;
            String value = "contra_" + i;
            map.put(key, value);
        }
        // Imprimir el HashMap para saber que datos tiene y poder evaluar el programa
        System.out.println(map);

        System.out.println("****************************************");
        Scanner in = new Scanner(System.in);
        int count = 0;

        //pedir datos y comprobar si estan en el HashMap
        while(count < 4) {
            
            System.out.println("Ingrese nombre de usuario:");
            String nombre = in.nextLine();
            System.out.println("Ingrese su contraseña:");

            String contra = in.nextLine();
            
            boolean exist = map.containsKey(nombre) & map.containsValue(contra);
            if (exist) {
                System.out.println("Ha accedido aceptado");
                 break;
            }  else {
                count++;
                System.out.println("Usuario o contraseña incorrectos. Intento " + count + " de 4.");
            }
            
        }
        if(count==4){
            System.out.println("Lo siento, no tiene acceso al área restringida");
        }
        in.close();
    }

    public static void main(String[] args) {
        login(); //lammar el metodo
    }

}
