package prova;
import java.time.LocalDate;
import java.time.LocalTime;

public class Evento {
    private String nome;
    private TipoEvento tipo;
    private LocalDate data;
    private LocalTime hora;

    public Evento(String nome, TipoEvento tipo, LocalDate data, LocalTime hora) {
        this.nome = nome;
        this.tipo = tipo;
        this.data = data;
        this.hora = hora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String toString() {
        return nome + " (" + tipo + ") - " + data + " AS " + hora;
    }
}
