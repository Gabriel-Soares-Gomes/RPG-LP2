import missao.Missao;
import personagem.Personagem;
import recompensa.Recompensa;

public class Main {

   public static void main(String[] args){
      Personagem p1 = new Personagem("heitor", 10, 0 );
      Recompensa r1 = new Recompensa(10, 50);
      Missao missao1 = new Missao("missao", r1);

      p1.reinvidicar(missao1.concluir());
   } 
}
