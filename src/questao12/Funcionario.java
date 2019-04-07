package questao12;

import java.util.ArrayList;

/**
 * @author Eduardo C.
 */
public class Funcionario {
    private String nome;
    private char sexo;
    private char nivel;
    private ArrayList<String> dependentes = new ArrayList<>();

    public Funcionario(String nome, char sexo, char nivel) {
        this.nome = nome;
        if (validarSexo(sexo)) {
        this.sexo = sexo;
        }
        this.nivel = nivel;
    }
    public double calcularSalario(){
        switch(this.nivel){
            case 'T':
                System.out.println("O salário desse funcionário é de R$2000,00");
                return 2000;
            case 'P':
                System.out.println("O salário desse funcionário é de R$3500,00");
                return 3500;
            case 'S':
                System.out.println("O salário desse funcionário é de R$5000,00");
                return 5000;
        }
        return 0;
    }
    public void mostrarDependentes(){
        for (String dependente : this.dependentes) {
            System.out.println(dependente);
        }
    }
    public boolean validarSexo(char sexo){
        if (sexo != 'M' && sexo != 'F') {
            System.out.println("Sexo inválido");
            return false;
        }else{
            return true;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getNivel() {
        return nivel;
    }

    public void setNivel(char nivel) {
        this.nivel = nivel;
    }
}
