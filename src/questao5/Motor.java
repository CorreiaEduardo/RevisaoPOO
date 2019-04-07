package questao5;

/**
 * @author Eduardo C.
 */
public class Motor {
    private String nome;
    private double potencia;

    public double getPotencia() {
        return potencia;
    }

    public Motor(String nome, double potencia) {
        this.nome = nome;
        this.potencia = potencia;
        this.ligado = false;
    }
    private boolean ligado;
    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isLigado() {
        return ligado;
    }
}
