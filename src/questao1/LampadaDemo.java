package questao1;

import java.util.Scanner;

/**
 * @author aluno
 */
public class LampadaDemo {

    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma potência: ");
        lampada.setPotenciaWatts(sc.nextDouble());
        lampada.ligar();
        System.out.println("A lampada foi ligada");
        lampada.desligar();
        System.out.println("A lampada foi desligada");
        System.out.println("A potência da lâmpada é "+lampada.getPotenciaWatts());
    }
    
}
