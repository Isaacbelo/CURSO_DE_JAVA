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

    char jogoVelha[][] = new char[3][3];
    int jogada = 1; // Conta número de Jogadas

    boolean validarJogada(int linha, int coluna, char sinal) {
        if (jogoVelha[linha][coluna] == sinal || jogoVelha[linha][coluna] == 'O') {//Inicio if valida simbolo

            return false;
        } else {//Jogada válida
            jogoVelha[linha][coluna] = sinal;
            jogada++; // incrementa a cada jogada, pares = jogador 2 e impares = jogador 1.
            return true;

        }//Fim if valida simbolo
    }

    //Imprimir tabuleiro
    void imprimirTabuleiro() {
        for (int i = 0; i < jogoVelha.length; i++) {
            for (int j = 0; j < jogoVelha[i].length; j++) {
                System.out.print(jogoVelha[i][j] + " | ");
            }//Fim for j
            System.out.println();
        }//Fim for i
    }

    boolean verificarGanhador(char sinal) {//Inicio verifica jogador
        //Valida Jogador
        if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) || //Linha 1
                (jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal) || //Linha 2
                (jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal) || //Linha 3
                (jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal) || //Coluna 1
                (jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) || //Coluna 2
                (jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal) || //Coluna 3
                (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal) || //Diagonal 1
                (jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal))//Diagonal 2
        {
            return true;

        } else {
            return false;
        }
    }//Fim verifica jogador

    boolean vezJogador1() {
        if (jogada % 2 == 1) {
            return true;
        } else {
            return false;
        }

    }

}
