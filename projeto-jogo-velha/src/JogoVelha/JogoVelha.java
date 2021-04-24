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

    private char jogoVelha[][];
    private int jogada; // Conta número de Jogadas

    public JogoVelha() {
        jogoVelha = new char[3][3];
        jogada = 1;
    }

    public boolean validarJogada(int linha, int coluna, char sinal) {
        if (getJogoVelha()[linha][coluna] == sinal || getJogoVelha()[linha][coluna] == 'O') {//Inicio if valida simbolo

            return false;
        } else {//Jogada válida
            getJogoVelha()[linha][coluna] = sinal;
            setJogada(getJogada() + 1); // incrementa a cada jogada, pares = jogador 2 e impares = jogador 1.
            return true;

        }//Fim if valida simbolo
    }

    //Imprimir tabuleiro
    public void imprimirTabuleiro() {
        for (int i = 0; i < getJogoVelha().length; i++) {
            for (int j = 0; j < getJogoVelha()[i].length; j++) {
                System.out.print(getJogoVelha()[i][j] + " | ");
            }//Fim for j
            System.out.println();
        }//Fim for i
    }

    public boolean verificarGanhador(char sinal) {//Inicio verifica jogador
        //Valida Jogador
        if ((getJogoVelha()[0][0] == sinal && getJogoVelha()[0][1] == sinal && getJogoVelha()[0][2] == sinal) || //Linha 1
                (getJogoVelha()[1][0] == sinal && getJogoVelha()[1][1] == sinal && getJogoVelha()[1][2] == sinal) || //Linha 2
                (getJogoVelha()[2][0] == sinal && getJogoVelha()[2][1] == sinal && getJogoVelha()[2][2] == sinal) || //Linha 3
                (getJogoVelha()[0][0] == sinal && getJogoVelha()[1][0] == sinal && getJogoVelha()[2][0] == sinal) || //Coluna 1
                (getJogoVelha()[0][1] == sinal && getJogoVelha()[1][1] == sinal && getJogoVelha()[2][1] == sinal) || //Coluna 2
                (getJogoVelha()[0][2] == sinal && getJogoVelha()[1][2] == sinal && getJogoVelha()[2][2] == sinal) || //Coluna 3
                (getJogoVelha()[0][0] == sinal && getJogoVelha()[1][1] == sinal && getJogoVelha()[2][2] == sinal) || //Diagonal 1
                (getJogoVelha()[0][2] == sinal && getJogoVelha()[1][1] == sinal && getJogoVelha()[2][0] == sinal))//Diagonal 2
        {
            return true;

        } else {
            return false;
        }
    }//Fim verifica jogador

    public boolean vezJogador1() {
        if (getJogada() % 2 == 1) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * @return the jogoVelha
     */
    public char[][] getJogoVelha() {
        return jogoVelha;
    }

    /**
     * @param jogoVelha the jogoVelha to set
     */
    public void setJogoVelha(char[][] jogoVelha) {
        this.jogoVelha = jogoVelha;
    }

    /**
     * @return the jogada
     */
    public int getJogada() {
        return jogada;
    }

    /**
     * @param jogada the jogada to set
     */
    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

}
