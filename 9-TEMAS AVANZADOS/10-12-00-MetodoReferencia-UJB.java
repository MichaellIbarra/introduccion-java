import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        //for(String elemento: miLista){
        //    System.out.println("Dia de la semana: " + elemento );
        //}

        // Funciones lambda (funcion anonima de un codigo muy compacto)
//        miLista.forEach( elemento -> {
//            System.out.println("Elemento: " + elemento);
//        } );

        miLista.forEach(System.out::println);

        List<String> nombres = Arrays.asList("Pedro", "Ivonne", "Nohemi");
        System.out.println("\nLista de Nombres: ");
        nombres.forEach(System.out::println);

    }
}
