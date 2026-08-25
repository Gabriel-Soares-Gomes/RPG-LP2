package personagem;

import inventario.Inventario;
import missao.EstadoMissao;
import missao.Missao;
import recompensa.Recompensa;

public class Personagem {

    private String nome;
    private int energia;
    private int ouro;
    private Missao missaoAtual;
    private Inventario inventario;

    public int getOuro() {
        return ouro;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public Missao getMissaoAtual() {
        return missaoAtual;
    }

    public void setMissaoAtual(Missao missaoAtual) {
        this.missaoAtual = missaoAtual;
        missaoAtual.setSituacaoAtual(EstadoMissao.EM_ANDAMENTO);
        System.out.println("Missão: " + missaoAtual.getTitulo());
    }

    public Inventario getInventario() {
        return inventario;
    }

    public Personagem(String nome, int energia, int ouro) {
        this.nome = nome;
        this.energia = energia;
        this.ouro = ouro;
        this.inventario = new Inventario();
    }

    public Personagem() {
        this.nome = "Fulano";
        this.energia = 100;
        this.inventario = new Inventario();
    }

    public void concluirMissaoAtual() {
        Recompensa recompensa = missaoAtual.concluir();
        this.energia += recompensa.getEnergia();
        this.ouro += recompensa.getOuro();
        if (recompensa.getItemRecompensa() != null) {
            inventario.adicionar(recompensa.getItemRecompensa());
        }
        System.out.println("energia após missão: " + this.energia + "\n" + "ouro após missão: " + this.ouro);
        System.out.println("Itens no inventário depois da missao:");
        this.printItens();
        System.out.println("\n");
    }

    public void printItens() {
        inventario.printItens();
    }

    public void antesDaMissao() {
        System.out.println("Itens, energia e ouro no inventário antes da missao:");
        this.printItens();
        System.out.println("Energia: " + this.getEnergia());
        System.out.println("Ouro: " + this.getOuro() + "\n");
    }

};
