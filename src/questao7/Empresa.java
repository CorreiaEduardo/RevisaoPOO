package questao7;

/**
 * @author Eduardo C.
 */
public class Empresa {
    private String nome;
    private double capital;
    private int nFuncionarios;

    public Empresa(String nome, double capital, int nFuncionarios) {
        this.nome = nome;
        this.capital = capital;
        this.nFuncionarios = nFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public double getCapital() {
        return capital;
    }

    public int getnFuncionarios() {
        return nFuncionarios;
    }
    
}
