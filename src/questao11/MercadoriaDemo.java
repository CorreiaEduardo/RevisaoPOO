package questao11;

/**
 * @author Eduardo C.
 */
public class MercadoriaDemo {
    public static void main(String[] args) {
        Mercadoria m1 = new Mercadoria("Pão", 1, 100);
        m1.comprar();
        System.out.println(m1.comprar(5));
        System.out.println(m1.comprar(50, 10));
    }
}
