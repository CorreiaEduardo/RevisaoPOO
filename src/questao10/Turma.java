package questao10;

import java.util.ArrayList;

/**
 * @author Eduardo C.
 */
public class Turma {
    private ArrayList<String> nomes;
    private ArrayList<Float> notas;

    public Turma(ArrayList<String> nomes,ArrayList<Float> notas) {
        this.nomes=nomes;
        this.notas=notas;
    }
    
    public float calcularMediaNota(ArrayList<Float> notas){
        float soma = 0;
        int cont = 0;
        for (Float nota : notas) {
            soma+=nota;
            cont++;
        }
        return soma/cont;
    }
    public void imprimirAlunos(){
        for (int i=0;i<this.nomes.size();i++) {
            System.out.println("O(a) aluno(a) "+this.nomes.get(i)+" recebeu a nota "+this.notas.get(i));
        }
    }
    
}
