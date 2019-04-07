package questao6;

/**
 * @author Eduardo C.
 */
public class RefrigeranteDemo {
    public static void main(String[] args) {
        Refrigerante refri1 = new Refrigerante("Cocacola", 1.50, 40);
        Refrigerante refri2 = new Refrigerante("FantaUva", 0.90, 10);
        Refrigerante refri3 = new Refrigerante("FantaLaranja", 0.90, 8);
        Refrigerante refri4 = new Refrigerante("Sprite", 0.80, 20);
        Refrigerante refri5 = new Refrigerante("Kuat", 1, 100);
        refri1.efetuarVenda();
        System.out.println("Existem mais "+refri1.getQtdEstoque()+" "+refri1.getNome()+" no estoque");
        System.out.println("O cliente recebe um troco de "+(5-1.50));
        refri2.efetuarVenda();
        System.out.println("Existem mais "+refri2.getQtdEstoque()+" "+refri2.getNome()+" no estoque");
        System.out.println("O cliente recebe um troco de "+(5-0.90));
    }
}
