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
        JogoVelha jogo = new JogoVelha();
        String simbolo; //Valida o símbolo
        int jogada = 1; // Conta número de Jogadas
        boolean ganhou = false;

        System.out.println(":::: JOGO DA VELHA ::::");
        jogo.mostraTabuleiro();

        System.out.println("\nJogador 1 = X\nJogador 2 = O");
        simbolo = input.next();

        while (!ganhou) {//Verifica se alguem ganhou, se ninguem ganhou faz o comando
            if (jogada % 2 == 1) {//If para escolha dos jogadores(jogada impar = jogador 1
                System.out.println("Jogador 1 escolha a posição desejada: ");
            }

        }// Fim do While

    }

}
