package FightFolder;

public class LutadorFirstClass {
    // ATRIBUTES 
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    // SPECIALS ATRIBUTES 
    public LutadorFirstClass(String no, String na, int id, double al, double pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double pe) {
        this.peso = pe;
        this.setCategoria();
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int id) {
        this.idade = id;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double al) {
        this.altura = al;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vi) {
        this.vitorias = vi;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int de) {
        this.derrotas = de;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int em) {
        this.empates = em;
    }
    private void setCategoria() {
        if(this.peso < 52.2) {
            this.categoria = "Inválido";
        }
        else if(this.peso <= 70.3) {
            this.categoria = "Leve";
        }
        else if(this.peso <= 83.9) {
            this.categoria = "Médio";
        }
        else if(this.peso <= 120.2) {
            this.categoria = "Pesado";
        }
        else {
            this.categoria = "Inválido";
        }
    }
    public String getCategoria() {
        return categoria;
    }
    public void ganharLuta() {  
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta() {  
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    public void apresentar() {
        System.out.println("____________________________");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Pesando: " + this.getPeso());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }
    public void status() {
        System.out.println(this.getNome() + "é um peso: " + this.getCategoria());
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Empatou: " + this.getEmpates());
        System.out.println("Perdeu: " + this.getDerrotas());
    }
}
