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
        JogoVelha jogoDaVelha = new JogoVelha();

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;//Declarado fora do escopo do while

        System.out.println(":::: JOGO DA VELHA ::::");

        while (!ganhou) {//Verifica se alguem ganhou, se ninguem ganhou faz o comando
            if (jogoDaVelha.vezJogador1()) {
                System.out.println("Jogador 1 escolha a posição desejada: ");
                sinal = 'X';

            } else {
                System.out.println("Jogador 2 escolha a posição desejada: ");
                sinal = 'O';
            }//Fim do if/else

            linha = valor("Linha", input);//Chamada de método 'valor' dentro do método 'Main' - Somente pode chamar método estático dentro do método main estático 
            coluna = valor("Coluna", input);

            jogoDaVelha.validarJogada(linha, coluna, sinal);
            jogoDaVelha.imprimirTabuleiro();

            if (jogoDaVelha.verificarGanhador('X')) {
                ganhou = true;
                System.out.println("Vencedor => Jogador 1!");
            } else if (jogoDaVelha.verificarGanhador('O')) {
                ganhou = true;
                System.out.println("Vencedor => Jogador 2!");
            } else if (jogoDaVelha.jogada > 9) {
                ganhou = true;
                System.out.print("VELHA");
            }
        }//Fim do while
        
    }//Fim Main

    static int valor(String tipoValor, Scanner input) {
        int valor = 0;
        boolean valorValida = false;
        while (!valorValida) {
            System.out.println("Entre com a" + tipoValor + " linha (1,2,3)");
            valor = input.nextInt();
            if (valor >= 1 && valor <= 3) {
                valorValida = true;
            } else {
                System.out.println("Entrada inválida. Tente novamente.");
            }
        }//Fim While linha
        valor--; //Decrementa o valor devido à matriz começar linhas e colunas do zero.
        return valor;
    }//Fim int valor
}//Fim Classe
