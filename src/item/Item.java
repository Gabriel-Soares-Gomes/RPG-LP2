package item;

public class Item {
    private String nome;
    private Raridade raridade;
    private TipoItem tipo;

    public Item(String nome, Raridade raridade, TipoItem tipo) {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode estar em branco!");
        }

        this.nome = nome;
        this.raridade = raridade;
        this.tipo = tipo;
    }

    public String nome() {
        return nome;
    }

    public Raridade raridade() {
        return raridade;
    }

    public TipoItem tipo() {
        return tipo;
    }
}
