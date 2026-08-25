package personagem;

import recompensa.Recompensa;
import missao.Missao;
import missao.EstadoMissao;
import inventario.Inventario;

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

    @Deprecated
    public void reinvidicar(Recompensa recompensa) {
        this.energia += recompensa.getEnergia();
        this.ouro += recompensa.getOuro();
        System.out.println("energia após missão: " + this.energia + " ouro após missão: " + this.ouro);
    }

    public void concluirMissaoAtual() {
        Recompensa recompensa = missaoAtual.concluir();
        this.energia += recompensa.getEnergia();
        this.ouro += recompensa.getOuro();
        if (recompensa.getItemRecompensa() != null) {
            inventario.adicionar(recompensa.getItemRecompensa());
        }
        System.out.println("energia após missão: " + this.energia + " ouro após missão: " + this.ouro);
    }

    public void printItens() {
        inventario.printItens();
    }

};
