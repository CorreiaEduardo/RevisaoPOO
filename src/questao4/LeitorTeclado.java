package questao4;

/**
 * @author Eduardo C.
 */
public class LeitorTeclado {
    public static void ler(String nome,Produto[] lista){
        boolean found = false;
        for (Produto produto : lista) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Preço: "+produto.getPreco());
                System.out.println("Saldo: "+produto.getSaldo());
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Produto inexistente no catálogo.");
        }
    }
}
