/*(Lembrete falta separar limite do saldo)
 * Exercícios de Java – Aula 24 – OO – Classes e Atributos Link do curso: http://www.loiane.com/2013/10/curso-java-basico-java-se-gratuito/
 * 
 * 5. Cria uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se ela é especial ou não,
 * um limite.
 */
package ContaAula24;

/**
 *
 * @author Isaac Belo
 */
public class ContaCorrente {

    private String agencia;
    private String numeroConta;
    private String correntista;
    private double saldo;
    private boolean especial;
    private double limite;

    // Método saldo
    public void mostrarSaldo() {//--------------------
        System.out.println("Conta: " + this.numeroConta + "\nAgência: " + this.agencia + "\nTitular: " + this.correntista + "\nSaldo: " + this.saldo);

    }//fim mostrarSaldo-----------------------

    public double depositar(double valor) {//-----------------------
        this.saldo = valor + this.saldo;
        System.out.println("Operação realizada com sucesso!");
        return this.saldo;
    }//fim depositar--------------------------

    public double sacar(double valorSaque) {//-----------------------
        if (valorSaque > (this.saldo + this.limite)) {
            System.out.println("Saldo insuficiente!");
        } else {
            this.saldo = this.saldo - valorSaque;
            System.out.println("Operação realizada com sucesso!");
        }
        return this.saldo;

    }//fim depositar--------------------------
//Método construtor vazio (Atalho ctrl+espaço)

    public ContaCorrente() {
    }
//Método construtor com respectivos parâmetros (Atalho ctrl+espaço)

    public ContaCorrente(String agencia, String numeroConta, String correntista, double saldo, boolean especial, double limite) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.correntista = correntista;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
    }
//Métodos getters e setters

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getCorrentista() {
        return this.correntista;
    }

    public void setCorrentista(String correntista) {
        this.correntista = correntista;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return this.especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}
