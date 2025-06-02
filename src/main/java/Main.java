import org.example.Helper;
import org.example.Sala;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cerinta_1("intrare.txt");
        Cerinta_2("intrare.txt");
    }

    public static void Cerinta_1(String fisierul) {
        System.out.println("1. first request");

        Helper h = new Helper();
        List<Sala> salile = h.DinFisier(fisierul);

        //String etaj="parter"; No, no, no! U said different.
        List<String> etaje = new ArrayList<>();
        for (Sala a : salile) {
            if (!etaje.contains(a.getEtaj())) {
                etaje.add(a.getEtaj());
            }
        }

        for (String x : etaje) {
            System.out.println(x);

            for (Sala y : salile) {
                if (x.equals(y.getEtaj())) {
                    System.out.println(y.toString());
                }
            }
            System.out.println("\n");
        }
        System.out.println("!!! that's how it should be done\n\n");
    }

    public static void Cerinta_2(String fisierul) {
        System.out.println("2. second request");
        Helper h = new Helper();
        List<Sala> salile = h.DinFisier(fisierul);
        String ref = "im";
        for (Sala a : salile) {
            if (a.getTip().toLowerCase().contains(ref) || a.getNume().toLowerCase().contains(ref)) {
                System.out.println(a.toString());
            }
        }
    }
}