package questao4;

/**
 * @author Eduardo C.
 */
public class Produto {
    private String nome;
    private String descricao;
    private double preco;
    private int saldo;
    public Produto(String descricao, double preco, int saldo) {
        this.descricao = descricao;
        this.preco = preco;
        this.saldo = saldo;
    }
    public Produto(String nome, String descricao, double preco, int saldo) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
