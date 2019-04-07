package questao1;

/**
 * @author aluno
 */
public class Lampada {
    private double potenciaWatts;
    private boolean estaLigada;

    public Lampada(){
        this.estaLigada = false;
    }
    
    public double getPotenciaWatts() {
        return potenciaWatts;
    }

    public void setPotenciaWatts(double potenciaWatts) {
        this.potenciaWatts = potenciaWatts;
    }

    public boolean getEstadoLampada() {
        return estaLigada;
    }

    public void ligar() {
        this.estaLigada = true;
    }
    public void desligar() {
        this.estaLigada = false;
    }
    
    
}
