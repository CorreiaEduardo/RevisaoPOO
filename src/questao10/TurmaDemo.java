package questao10;

import java.util.ArrayList;

/**
 * @author Eduardo C.
 */
public class TurmaDemo {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");nomes.add("Vitor");nomes.add("Maria");nomes.add("Joana");nomes.add("José");
        nomes.add("André");nomes.add("Gabriel");nomes.add("Gabriela");nomes.add("Augusto");nomes.add("Victor");
        ArrayList<Float> notas = new ArrayList<>();
        notas.add(10f);notas.add(7.9f);notas.add(8.4f);notas.add(8.8f);notas.add(5.5f);
        notas.add(4.8f);notas.add(5.4f);notas.add(8.6f);notas.add(9.3f);notas.add(9.4f);
        Turma turma = new Turma(nomes, notas);
        System.out.println("A média da turma é "+turma.calcularMediaNota(notas));
        turma.imprimirAlunos();
        
    }
}
