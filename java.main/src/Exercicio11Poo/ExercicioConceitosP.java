package Exercicio11Poo;

public class ExercicioConceitosP {
    public String nome;
    public int idade;
    public String sexo;

    public String getNome() {
        return nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return idade;
    }
    public void setNome(int id) {
        this.idade = id;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String s) {
        this.sexo = s;
    }

    public void fazerAniv() {
        this.idade ++;
    }

    public ExercicioConceitosP(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
}
