package recompensa;

import item.Item;

public class Recompensa {

    private int ouro;
    private int energia;
    private Item itemRecompensa = null;

    public Recompensa(int ouro, int energia) {
        this.ouro = ouro;
        this.energia = energia;
    }

    public Recompensa(int ouro, int energia, Item itemRecompensa) {
        this.ouro = ouro;
        this.energia = energia;
        this.itemRecompensa = itemRecompensa;
    }

    public int getOuro() {
        return ouro;
    }

    public int getEnergia() {
        return energia;
    }

    public Item getItemRecompensa() {
        return itemRecompensa;
    }

}
