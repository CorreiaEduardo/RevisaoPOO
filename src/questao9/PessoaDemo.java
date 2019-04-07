package questao9;

/**
 * @author Eduardo C.
 */
public class PessoaDemo {
    public static void main(String[] args) {
        Pessoa[] listaPessoas = new Pessoa[4];
        listaPessoas[0] = new Pessoa("A", 10,1.50,30,'M');
        listaPessoas[1] = new Pessoa("B", 20,1.70,70,'F');
        listaPessoas[2] = new Pessoa("C", 30,1.89,90,'M');
        listaPessoas[3] = new Pessoa("D", 40,1.73,130,'M');
        
        System.out.println(listaPessoas[0].calcIMC());
        System.out.println(listaPessoas[1].calcIMC());
        System.out.println(listaPessoas[2].calcIMC());
        System.out.println(listaPessoas[3].calcIMC());
        
        System.out.println(listaPessoas[0].toString());
        System.out.println(listaPessoas[1].toString());
        System.out.println(listaPessoas[2].toString());
        System.out.println(listaPessoas[3].toString());
    }
}
