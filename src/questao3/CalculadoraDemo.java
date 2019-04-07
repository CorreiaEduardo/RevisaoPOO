package questao3;

/**
 * @author Eduardo C.
 */
public class CalculadoraDemo {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println(c.somar(5, 12));
        System.out.println(c.subtrair(5, 12));
        System.out.println(c.multiplicar(5, 12));
        System.out.println(c.dividir(5, 0));
    }
}
