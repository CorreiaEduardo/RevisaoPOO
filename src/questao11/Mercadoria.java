package questao11;

/**
 * @author Eduardo C.
 */
public class Mercadoria {
    String nome;
    double valor;
    int qtdEstoque;

    public Mercadoria(String nome, double valor, int qtdEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.qtdEstoque = qtdEstoque;
    }
    public double comprar(){
        this.qtdEstoque--;
        return this.valor;
    }
    public double comprar(int qnt){
        this.qtdEstoque-=qnt;
        return this.valor*qnt;
    }
    public double comprar(int qnt, double desconto){
        desconto /= 100;
        desconto = 1-desconto;
        this.qtdEstoque-=qnt;
        return (this.valor*qnt)*desconto;
    }
}
