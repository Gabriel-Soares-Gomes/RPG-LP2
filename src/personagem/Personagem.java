package personagem;
import recompensa.Recompensa;
public class Personagem {
    private String nome;
    private int energia;
    private int ouro;

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

    public Personagem(String nome, int energia, int ouro) {
        this.nome = nome;
        this.energia = energia;
        this.ouro = ouro;
    }

    public Personagem() {
        this.nome = "Fulano";
        this.energia = 100;
    }

    public void reinvidicar(Recompensa recompensa) {
        this.energia += recompensa.getEnergia();
        this.ouro += recompensa.getOuro();
        System.out.println("energia após missão: " + this.energia + " ouro após missão: " + this.ouro);
    }

};
