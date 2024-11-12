package prova;

public class Cliente {
    private String id;
    private String nome;
    private String cadeira;
    private CategoriaIngresso categoriaIngresso;


    public Cliente(String id, String nome, String cadeira, CategoriaIngresso categoriaIngresso) {
        this.id = id;
        this.nome = nome;
        this.cadeira = cadeira;
        this.categoriaIngresso = categoriaIngresso;
    }

 
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCadeira() {
        return cadeira;
    }

    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }

    public CategoriaIngresso getCategoriaIngresso() {
        return categoriaIngresso;
    }

    public void setCategoriaIngresso(CategoriaIngresso categoriaIngresso) {
        this.categoriaIngresso = categoriaIngresso;
    }

    public String toString() {
        return nome + " (" + categoriaIngresso + ") - CADEIRA: " + cadeira;
    }
}
