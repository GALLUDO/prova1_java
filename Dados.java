package prova;
import java.util.ArrayList;
import java.util.List;

public class Dados implements IDados {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private Evento evento;
    private List<CompraIngresso> ingressos = new ArrayList<>();


    public List<Cliente> clientes() {
        return clientes;
    }


    public List<Funcionario> funcionarios() {
        return funcionarios;
    }


    public Evento evento() {
        return evento;
    }


    public List<CompraIngresso> ingressos() {
        return ingressos;
    }

    public void adicionarCompra(CompraIngresso compra) {
        ingressos.add(compra);
    }

    private Double valoringresso(CategoriaIngresso categoria) {
        double valorBase = 80.25;
        return valorBase * (1 - categoria.getDesconto());
    }
}
