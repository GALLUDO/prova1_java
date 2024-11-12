package prova;
import java.util.List;

public class Imprimir {
    public static void impressao(List<CompraIngresso> ingressos) {
        for (CompraIngresso ingresso : ingressos) {
            System.out.println(ingresso);
        }
    }
}
