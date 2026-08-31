# Documentação do Jogo LP2

## 👥 Equipe
 - Anthony Gabriel Gomes Rocha 
      - aggr5555@gmail.com
 - Gabriel Soares Gomes
      - gabrielsoaresgomes14@gmail.com
 - Heitor Gomes de Sena Melo Mariz
      - marizheitor@gmail.com
 - Mauro Cesar Guerra Pacheco
      - maurinpacheco@gmail.com

## 🛠️ Como Compilar e Executar

Para compilar e rodar o projeto via terminal, utilize os seguintes comandos na raiz da pasta `src`:

1. **Compilar todos os arquivos:**
   ```bash
   javac Main.java
2. Executar o programa:
java Main

## Implementações

Este projeto implementa a estrutura básica de um sistema de RPG, focando na gestão de personagens, missões e inventário.


### 📦 Gestão de Itens (`item/`)
- **Item**: Classe base para representar objetos do jogo.
- **Raridade**: Enumeração para definir a raridade dos itens (ex: LENDÁRIO, ÉPICO).
- **TipoItem**: Enumeração para categorizar itens (ex: ARMADURA, ARMA, CHAVE).

### 🎒 Inventário (`inventario/`)
- **Inventario**: Gerencia a coleção de itens que um personagem possui.

### 🗺️ Missões (`missao/`)
- **Missao**: Define os objetivos e a recompensa ao ser concluída.
- **EstadoMissao**: Enumeração para controlar o ciclo de vida da missão (ex: EM_ANDAMENTO).

### 🎁 Recompensas (`recompensa/`)
- **Recompensa**: Define o que o jogador ganha ao completar uma missão, podendo incluir experiência, moedas e itens.

### 👤 Personagem (`personagem/`)
- **Personagem**: Integra todas as funcionalidades, permitindo que o personagem possua um inventário, aceite missões e receba recompensas.

### 🚀 Execução (`Main.java`)
- Classe principal que demonstra a criação de itens, missões e a interação do personagem com esses elementos.

## Estrutura do Projeto
```text
src/
├── Main.java
├── inventario/
│   └── Inventario.java
├── item/
│   ├── Item.java
│   ├── Raridade.java
│   └── TipoItem.java
├── missao/
│   ├── EstadoMissao.java
│   └── Missao.java
├── personagem/
│   └── Personagem.java
└── recompensa/
    └── Recompensa.java
