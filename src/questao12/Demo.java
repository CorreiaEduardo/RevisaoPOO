package questao12;

/**
 * @author Eduardo C.
 */
public class Demo {
    public static void main(String[] args) {
        ConsultorDeVendas c = new ConsultorDeVendas("aaaaa", 'M', 'S',500);
        c.calcularSalario();
        Funcionario f = new Funcionario("bbbbb", 'F', 'T');
        f.calcularSalario();
    }
}
