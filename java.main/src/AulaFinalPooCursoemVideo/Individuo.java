package AulaFinalPooCursoemVideo;

public abstract class Individuo {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiência;

    
    public Individuo(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiência = 0;
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
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public float getExperiência() {
        return experiência;
    }
    public void setExperiência(float experiência) {
        this.experiência = experiência;
    }

    
    @Override
    public String toString() {
        return "Individuo [experiência=" + experiência + ", idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "]";
    }
}
