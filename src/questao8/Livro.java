package questao8;

/**
 * @author Eduardo C.
 */
public class Livro {
    String titulo;
    int qtdPaginas;
    public Livro(String titulo, int qtdPaginas) {
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
    }
    
    public static void main(String[] args) {
        Livro[] listaLivros = new Livro[4];
        listaLivros[0] = new Livro("Harry Potter e a Pedra Filosofal", 211);
        listaLivros[1] = new Livro("Harry Potter e a Câmara Secreta", 238);
        listaLivros[2] = new Livro("Harry Potter e o Prisioneiro de Azkaban", 300);
        listaLivros[3] = new Livro("Harry Potter e o Cálice de Fogo", 831);
    }
}
