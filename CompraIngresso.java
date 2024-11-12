package prova;

import java.time.LocalDate;
import java.time.LocalTime;

public class CompraIngresso {
    private Evento evento;
    private Cliente cliente;
    private Funcionario funcionario;
    private LocalDate diaVenda;
    private LocalTime horaVenda;
    private double valorIngresso;

    public CompraIngresso(Evento evento, Cliente cliente, Funcionario funcionario, LocalDate diaVenda, LocalTime horaVenda) {
        this.evento = evento;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.diaVenda = diaVenda;
        this.horaVenda = horaVenda;
        this.valorIngresso = valoringresso(cliente.getCategoriaIngresso());
    }

    private Double valoringresso(CategoriaIngresso categoria) {
        double valorBase = 80.25;
        return valorBase * (1 - categoria.getDesconto());
    }
    public Evento getEvento() {
        return evento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public LocalDate getDiaVenda() {
        return diaVenda;
    }

    public LocalTime getHoraVenda() {
        return horaVenda;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public String toString() {
        return evento + " - " + cliente + " - " + funcionario + " - Valor: R$" + valorIngresso;
    }
}
