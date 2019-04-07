package questao13;

import java.util.ArrayList;

/**
 * @author Eduardo C.
 */
public class DicionarioDemo {
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<>();
        ArrayList<String> significados = new ArrayList<>();
        
        palavras.add("Java"); significados.add("Linguagem de programação");
        palavras.add("Funcionário"); significados.add("Pessoa que trabalha");
        palavras.add("Aluno"); significados.add("Pessoa que estuda");
        palavras.add("Futebol"); significados.add("Modalidade de esporte");
        
        Dicionario d = new Dicionario(palavras, significados);
        
        System.out.println(d.pesquisar());
        System.out.println(d.pesquisar("Aluno"));
        System.out.println(d.pesquisar(3));
        d.validarPalavra("Futebol");
        d.validarPalavra("Armário");
    }
}
