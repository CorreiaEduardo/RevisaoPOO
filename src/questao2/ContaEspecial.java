package questao2;

/**
 * @author Eduardo C.
 */
public class ContaEspecial extends Conta{
    private double limite;
    public ContaEspecial(String n, int num, double s,double l) {
        super(n, num, s);
        this.limite = l;
    }
    @Override
    public boolean retirarValor(double valor) {
        if (valor <= (this.consultarValorDisponivel()+this.limite)) {
            this.saldo-=valor;
            return true;
        }
        return false;
    }
    @Override
    public double consultarValorDisponivel() {
        return this.saldo+this.limite;
    }
}
