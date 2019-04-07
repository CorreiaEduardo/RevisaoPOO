package questao2;
import questao2.*;

/**
 * @author Eduardo C.
 */
public class ContaDemo2 {
    public static void main(String[] args) {
        ContaEspecial contaEsp = new ContaEspecial("João", 1234, 100, 500);
        contaEsp.depositarValor(400);
        contaEsp.retirarValor(50);
        System.out.println("O valor disponível na conta é de R$"+contaEsp.consultarValorDisponivel());
        contaEsp.retirarValor(900);
        System.out.println("O valor disponível na conta é de R$"+contaEsp.consultarValorDisponivel());
        contaEsp.retirarValor(100);
        System.out.println("O valor disponível na conta é de R$"+contaEsp.consultarValorDisponivel());
        contaEsp.depositarValor(50);
        System.out.println("O valor disponível na conta é de R$"+contaEsp.consultarValorDisponivel());
        contaEsp.retirarValor(100);
        System.out.println("O valor disponível na conta é de R$"+contaEsp.consultarValorDisponivel());
        
    }
    
}
