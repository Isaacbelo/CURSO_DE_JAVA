/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoVelha;

import java.util.Scanner;

/**
 *
 * @author pr121981-local
 */
public class JogoVelhaApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //JogoVelha jogo = new JogoVelha();
        String simbolo; //Valida o símbolo
        char jogoVelha[][] = new char[3][3];
        int jogada = 1; // Conta número de Jogadas
        char sinal;
        int linha = 0, coluna = 0;//Declarado fora do escopo do while
        boolean ganhou = false;

        System.out.println(":::: JOGO DA VELHA ::::");
        //jogo.mostraTabuleiro();


        while (!ganhou) {//Verifica se alguem ganhou, se ninguem ganhou faz o comando
            if (jogada % 2 == 1) {//If para escolha dos jogadores(jogada impar = jogador 1
                System.out.println("Jogador 1 escolha a posição desejada: ");
                sinal = 'X';

            } else {
                System.out.println("Jogador 2 escolha a posição desejada: ");
                sinal = 'O';

            }//Fim do if/else
            boolean linhaValida = false;
            while (!linhaValida) {
                System.out.println("Entre com a linha (1,2,3)");
                linha = input.nextInt();
                if (linha > 0 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Entrada inválida. Tente novamente.");
                }
            }//Fim While linha

            boolean colunaValida = false;
            while (!colunaValida) {
                System.out.println("Entre com a coluna (1,2,3)");
                coluna = input.nextInt();
                if (coluna > 0 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("Entrada inválida. Tente novamente.");
                }

            }//Fim do while coluna
            //Decrementa para acertar valores com a matrix já que posições começam do 0.
            linha--;
            coluna--;
            if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {//Inicio if valida simbolo

                System.out.println("Posição já usada, tente novamente!");
            } else {//Jogada válida
                jogoVelha[linha][coluna] = sinal;
                jogada++; // incrementa a cada jogada, pares = jogador 2 e impares = jogador 1.

            }//Fim if valida simbolo

            //Imprimir tabuleiro
            for (int i = 0; i < jogoVelha.length; i++) {
                for (int j = 0; j < jogoVelha[i].length; j++) {
                    System.out.print(jogoVelha[i][j] + " | ");
                }//Fim for j
                System.out.println();
            }//Fim for i
            //Valida Jogador
            if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') || //Linha 1
                    (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') || //Linha 2
                    (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X')
                    || //Linha 3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || //Coluna 1
                    (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || //Coluna 2
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X')
                    || //Coluna 3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X') || //Diagonal 1
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X'))//Diagonal 2
            {
                ganhou = true; //Muda flag ganhador
                System.out.println("Vencedor Jogador 1");

            }else if
                 ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') || //Linha 1
                    (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') || //Linha 2
                    (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') || //Linha 3
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') || //Coluna 1
                    (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') || //Coluna 2
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') || //Coluna 3
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O') || //Diagonal 1
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O'))//Diagonal 2
                {
                ganhou = true; //Muda flag ganhador
                System.out.println("Vencedor Jogador 2");

            }else if(jogada >9){ganhou = true;System.out.print("VELHA");}
            
            

        }// Fim do While

    }

}
