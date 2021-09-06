package pilaresOO;

/**
 * Encapsulamento:
 * É a técnica utlizada para esconder uma ideia, ou seja, não expõe detalhes internos
 * para usuários. Torna as partes do sistemas mais independentes.
 */

public class Funcionario {
    private double salario;
    private String nome;

    public Funcionario(double salario, String nome) {
        this.salario = salario;
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }
}
