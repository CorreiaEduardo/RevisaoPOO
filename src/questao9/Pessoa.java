package questao9;

/**
 * @author Eduardo C.
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private char sexo;
    
    public Pessoa(String nome, int idade, double altura, double peso, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public double calcIMC(){
        return this.peso/(this.altura*this.altura);
    }
    
    public String calculaCategoria(double imc){
        if(imc <= 18.5){
            return "abaixo do peso normal";
        }else if(imc > 18.5 && imc <= 25){
            return "peso normal";
        }else if(imc > 25 && imc <= 30){
            return "acima do peso normal";
        }else{
            return "obesidade";
        }
    }
    
    @Override
    public String toString(){
        return this.nome+" está na categoria "+this.calculaCategoria(this.calcIMC());
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
