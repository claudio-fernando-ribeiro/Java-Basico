import java.util.List;
import java.util.ArrayList;

public class exercicioLista {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        //List<String> mortos = new ArrayList<String>();
        lista.add("Luke");
        lista.add("Leya");
        lista.add("Han");
        lista.add("Yoda");
        lista.add("Artie");

        //mortos.add("Luke");
        //mortos.add("Han");
        //mortos.add("Yoda");
        //lista.removeAll(mortos);
        //System.out.println(lista);
        System.out.println(lista.get(1));
        System.out.println(lista.get(4));
    }
}
