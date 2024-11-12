package prova;

import java.util.List;

public interface IDados {
    List<Cliente> clientes();
    List<Funcionario> funcionarios();
    Evento evento();
    List<CompraIngresso> ingressos();
}
