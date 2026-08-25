import item.Item;
import missao.Missao;
import personagem.Personagem;
import recompensa.Recompensa;

public class Main {

   public static void main(String[] args) {
      Personagem p1 = new Personagem("Heitor", 10, 0);
      
      p1.antesDaMissao();

      Item armadura = new Item("Thornmail", item.Raridade.LENDARIO, item.TipoItem.ARMADURA);
      Recompensa r1 = new Recompensa(10, 50, armadura);
      Missao missao1 = new Missao("Ruinas de Ragnarok", r1);

      p1.setMissaoAtual(missao1);

      p1.concluirMissaoAtual();

      p1.antesDaMissao();

      Item espada = new Item("World Divider", item.Raridade.EPICO, item.TipoItem.ARMA);
      Recompensa r2 = new Recompensa(5, 10, espada);
      Missao missao2 = new Missao("Caverna da escuridão", r2);

      p1.setMissaoAtual(missao2);

      p1.concluirMissaoAtual();

      p1.antesDaMissao();

      Item chave = new Item("Master Key", item.Raridade.RARO, item.TipoItem.CHAVE);
      Recompensa r3 = new Recompensa(2, 2, chave);
      Missao missao3 = new Missao("Caminhos Perdidos", r3);

      p1.setMissaoAtual(missao3);

      p1.concluirMissaoAtual();

   }
}
