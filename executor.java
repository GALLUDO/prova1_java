package prova;

import java.time.LocalDate;
import java.time.LocalTime;

public class executor {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("1", "JOANES", "A1", CategoriaIngresso.ESTUDANTE);
        Cliente cliente2 = new Cliente("2", "JOSEFIA", "B2", CategoriaIngresso.INTEIRO);

        Funcionario funcionario1 = new Funcionario("1", "JOBERVAL");
        Funcionario funcionario2 = new Funcionario("2", "JONERFINA");

        Evento evento = new Evento("FILME DE COMEDIA", TipoEvento.COMEDIA, LocalDate.now(), LocalTime.of(20, 0));

        CompraIngresso compra1 = new CompraIngresso(evento, cliente1, funcionario1, LocalDate.now(), LocalTime.now());
        CompraIngresso compra2 = new CompraIngresso(evento, cliente2, funcionario2, LocalDate.now(), LocalTime.now());

        Dados dados = new Dados();
        dados.adicionarCompra(compra1);
        dados.adicionarCompra(compra2);

        Imprimir.impressao(dados.ingressos());
    }
}
