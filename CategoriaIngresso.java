package prova;

public enum CategoriaIngresso {
    INTEIRO(0.0),
    ESTUDANTE(0.5),
    ESPECIAIS(0.2),
    CORTESIAS(1.0);

    private final double desconto;

    CategoriaIngresso(double desconto) {
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }
}
