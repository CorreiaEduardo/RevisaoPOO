package questao2;

import java.util.Scanner;

/**
 * @author Eduardo C.
 */
public class ContaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        int num = sc.nextInt();
        double saldo = sc.nextDouble();
        Conta conta = new Conta(nome,num,saldo); 
        conta.depositarValor(150);
        conta.retirarValor(40);
        System.out.println("O valor disponível na conta é de R$"+conta.consultarValorDisponivel());
        
    }
}
