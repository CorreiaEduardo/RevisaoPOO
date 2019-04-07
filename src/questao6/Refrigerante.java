package questao6;

/**
 * @author Eduardo C.
 */
public class Refrigerante {
    private String nome;
    private double preco;
    private int qtdEstoque;

    public Refrigerante(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }
    
    public void efetuarVenda(){
        this.qtdEstoque--;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
