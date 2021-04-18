package ContaAula24;

import java.util.Scanner;

/**
 *
 * @author Isaac Belo
 */
public class ContaCorrenteApp {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 1;
        double valor;
        

        ContaCorrente conta = new ContaCorrente(); // Classe instanciada
        conta.setAgencia ("123456");
        conta.setNumeroConta ("9999");
        conta.setCorrentista ( "João da Silva");
        conta.setSaldo  (-10);
        conta.setEspecial (true);
        conta.setLimite (500);

        while (opcao != 0) {// inicio while
            System.out.println("\nDigite a opção desejada: \n[1]Saldo \n[2]Deposito \n[3]Saque \n[0]Sair");
            opcao = entrada.nextInt();

            switch (opcao) {//Inicio switch--------------
                case 1:
                    conta.mostrarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor do depósito: R$ ");
                    valor = entrada.nextDouble();
                    conta.depositar(valor);
                    break;
                case 3:
                    System.out.print("Digite o valor que deseja retirar: R$ ");
                    valor = entrada.nextDouble();
                    conta.sacar(valor);
                    break;
                
            }//fim switch------------------------------
        }//fim while
        System.out.println("Obrigado, volte sempre!");

    }

}
