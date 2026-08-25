import item.Item;
import missao.Missao;
import personagem.Personagem;
import recompensa.Recompensa;

public class Main {

   public static void main(String[] args) {
      Personagem p1 = new Personagem("Heitor", 10, 0);
      System.out.println("Itens, energia e ouro no inventário antes da missao:");
      p1.printItens();
      System.out.println("Energia: " + p1.getEnergia());
      System.out.println("Ouro: " + p1.getOuro());

      Item armadura = new Item("Thornmail", item.Raridade.LENDARIO, item.TipoItem.ARMADURA);
      Recompensa r1 = new Recompensa(10, 50, armadura);
      Missao missao1 = new Missao("missao", r1);

      p1.setMissaoAtual(missao1);

      p1.concluirMissaoAtual();

      System.out.println("Itens no inventário depois da missao:");
      p1.printItens();

   }
}
