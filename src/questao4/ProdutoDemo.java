package questao4;

import java.util.Scanner;

/**
 * @author Eduardo C.
 */
public class ProdutoDemo {
    public static void main(String[] args) {
        Produto[] listaProdutos = new Produto[5];
        listaProdutos[0] = new Produto("Arroz", "Muito bom", 7, 5);
        listaProdutos[1] = new Produto("Feijão", "Muito top", 6, 9);
        listaProdutos[2] = new Produto("Bolacha", "Muito saboroso", 2, 20);
        listaProdutos[3] = new Produto("Macarrão", "Muito gostoso", 5, 12);
        listaProdutos[4] = new Produto("Ovo", "Muito cru", 4, 174);
        System.out.println("Insira o nome do produto");
        Scanner sc = new Scanner(System.in);
        String nomePesquisa = sc.next();
        while (!(nomePesquisa.equalsIgnoreCase("fim"))) {            
            LeitorTeclado.ler(nomePesquisa, listaProdutos);
            nomePesquisa = sc.next();
        }
    }
}
