import org.example.Helper;
import org.example.Sala;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    Cerinta_1("intrare.txt");
    }

    public static void Cerinta_1(String fisierul) {
        Helper h = new Helper();
        List<Sala> salile = h.DinFisier(fisierul);

        String etaj="parter";
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
                    System.out.println(y.getEtaj());
                }
            }
        }
    }
}