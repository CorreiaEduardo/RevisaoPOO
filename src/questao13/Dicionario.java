package questao13;

import java.util.ArrayList;

/**
 * @author Eduardo C.
 */
public class Dicionario {
    private ArrayList<String> palavras;
    private ArrayList<String> significados;

    public Dicionario(ArrayList<String> palavras, ArrayList<String> significados) {
        this.palavras = palavras;
        this.significados = significados;
    }
    public String pesquisar(){
        return this.significados.get(0);
    }
    public String pesquisar(String palavra){
        for (int i = 0; i < this.palavras.size(); i++) {
            if (this.palavras.get(i).equalsIgnoreCase(palavra)) {
                return this.significados.get(i);
            }
        }
        return "Não encontrado.";
    }
    public String pesquisar(int i){
        return this.significados.get(i);
    }
    
    public boolean validarPalavra(String p){
        for (String palavra : this.palavras) {
            if (palavra.equalsIgnoreCase(p)) {
                System.out.println("Palavra já existente no dicionário.");
                return false;
            }
        }
        return true;
    }
}
