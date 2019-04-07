package questao12;

/**
 * @author Eduardo C.
 */
public class ConsultorDeVendas extends Funcionario{
    public ConsultorDeVendas(String nome, char sexo, char nivel) {
        super(nome, sexo, nivel);
    }
    public ConsultorDeVendas(String nome, char sexo, char nivel, double valorBonus) {
        super(nome, sexo, nivel);
        this.ValorBonusMensal=valorBonus;
    }
    private double ValorBonusMensal;
    @Override
    public double calcularSalario(){
        System.out.println("Acrescido do valor de bonus mensal, o salário total é "+(super.calcularSalario()+this.ValorBonusMensal));
        return 0;
    }
}
