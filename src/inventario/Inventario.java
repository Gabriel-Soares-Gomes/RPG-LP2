package inventario;

import item.Item;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Item> itens = new ArrayList<>();
    private final int CAPACIDADE = 100;

    public int getCapacidade() { return CAPACIDADE; }
    public void adicionar(Item item){
        if(itens.size() >= CAPACIDADE){
            throw new IllegalStateException("Inventario cheio.");
        }
        itens.add(item);
    }

}
