package javacursocode;

public class ExercicioConceitosP {
    public String nome;
    public int idade;
    public char sexo;

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

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char s) {
        this.sexo = s;
    }

    public void fazerAniv() {
        this.idade ++;
    }

    public ExercicioConceitosP(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
}
