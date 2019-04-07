package questao2;

/**
 * @author Eduardo C.
 */
public class Conta {
    protected String nomeCliente;
    protected int numero;
    protected double saldo;
    private int teste;
    public Conta(String n,int num,double s){
        this.nomeCliente = n;
        this.numero = num;
        this.saldo = s;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double consultarValorDisponivel() {
        return saldo;
    }

    public void depositarValor(double valor) {
        this.saldo += valor;
    }
    public boolean retirarValor(double valor) {
        if ((this.consultarValorDisponivel()-valor) > 0) {
            this.saldo-=valor;
            return true;
        }
        return false;
    }

    public int getTeste() {
        return teste;
    }

    public void setTeste(int teste) {
        this.teste = teste;
    }
    
    
    
}
