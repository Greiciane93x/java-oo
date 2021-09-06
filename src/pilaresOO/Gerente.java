package pilaresOO;

/**
 * Herança: É a permissão que uma classe recebe em herdar atributos de uma outra.
 * As características são passadas do pai para o filho
 * Os modificadores de acesso só podem estar com visibilidade public e protected
 * para que sejam herdados
 * Para saber se estamos aplicando herança corretamente, utilizamos o teste "É UM".
 *
 */
public class Gerente extends Funcionario{

    private String usuario;
    private String senha;

    public Gerente(double salario, String nome) {
        super(salario, nome);
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public double calculaBonificacao(){
        return this.getSalario() * 0.6 + 100;
    }
}
