/*
 * Faça um programa para jogar o jogo da velha. O programa deve permitir que dois jogadores façam uma partida do jogo da velha, 
 * usando o computador para ver o tabuleiro. Cada jogador vai alternadamente informando a posição onde deseja colocar a sua peça
 * (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e determinar automaticamente quando o jogo terminou e quem foi o vencedor
 * (jogador1 ou jogador2). A cada nova jogada, o programa deve atualizar a situação do tabuleiro na tela
 */
package JogoVelha;

/**
 *
 * @author Is@@c Belo
 */
public class JogoVelha {

    int tabuleiro[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    // Método para mostrar tabuleiro
    void mostraTabuleiro() {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(" " + tabuleiro[row][column]);

            }System.out.println(" ");
        }
    }//Fim método mostrarTabuleiro
    //Método para escolha 
    void escolherPosicao(){
        }

}
