package missao;
import recompensa.Recompensa;

enum EstadoMissao{
   DISPONIVEL,
   EM_ANDAMENTO,
   CONCLUIDA,
   INDISPONIVEL
}

public class Missao {
      private String titulo;
      private Recompensa recompensa;
      EstadoMissao situacaoAtual;

   public Missao(String titulo, Recompensa recompensa) {
      this.titulo = titulo; 
      this.recompensa = recompensa;
}

   public Recompensa concluir() {
      return recompensa;

}
   public String getTitulo(){
      return this.titulo;
   }

   public void setTitulo(String titulo){
      this.titulo = titulo;
   }

   public Recompensa getRecompensa(){
      return this.recompensa;
   }

   public void setRecompensa(Recompensa recompensa){
      this.recompensa = recompensa;
   }
}

