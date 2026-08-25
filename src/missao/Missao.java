package missao;

import recompensa.Recompensa;

public class Missao {
   private String titulo;
   private Recompensa recompensa;
   EstadoMissao situacaoAtual;

   public Missao(String titulo, Recompensa recompensa) {
      this.titulo = titulo;
      this.recompensa = recompensa;
      this.situacaoAtual = EstadoMissao.DISPONIVEL;
   }

   public Recompensa concluir() {
      situacaoAtual = EstadoMissao.CONCLUIDA;
      return recompensa;

   }

   public String getTitulo() {
      return this.titulo;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   public Recompensa getRecompensa() {
      return this.recompensa;
   }

   public void setRecompensa(Recompensa recompensa) {
      this.recompensa = recompensa;
   }

   public EstadoMissao getSituacaoAtual() {
      return situacaoAtual;
   }

   public void setSituacaoAtual(EstadoMissao situacaoAtual) {
      this.situacaoAtual = situacaoAtual;
   }
}
