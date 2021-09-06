package pilaresOO;

/**
 * Abstração:
 * É utilizada para definir entidades do mundo real;
 * Essas classes são consideradas tudo que é real, tendo como consideração
 * as suas características e ações
 */
public class Conta {
    int numero;
    double saldo;
    double limite;

    void depositar(double valor){
        this.saldo += valor;
    }
    void sacar(double valor){
        this.saldo -= valor;
    }
    void imprimeExtrato(){
        System.out.println("Saldo: " + this.saldo);
    }
}

