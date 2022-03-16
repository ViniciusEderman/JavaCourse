package estudo;

class LutadorFirstClass {
    // ATRIBUTES 
    private String nome;
    private String nacionalidade;
    private int idade;
    private boolean altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // SPECIALS ATRIBUTES 
    public LutadorFirstClass(String no, String na, int id, boolean al, double pe, int vi, int de, int em) {
        nome = no;
        nacionalidade = na;
        idade = id;
        altura = al;
        setPeso(pe);
        vitorias = vi;
        derrotas = de;
        empates = em;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String no) {
        nome = no;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double pe) {
        peso = pe;
        setCategoria();
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String na) {
        nacionalidade = na;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int id) {
        idade = id;
    }
    public Boolean getAltura() {
        return altura;
    }
    public void setAltura(Boolean al) {
        altura = al;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vi) {
        vitorias = vi;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int de) {
        derrotas = de;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int em) {
        empates = em;
    }
    private void setCategoria() {
        if(peso < 52.2) {
            categoria = "Inválido";
        }
        else if(peso <= 70.3) {
            categoria = "Leve";
        }
        else if(peso <= 83.9) {
            categoria = "Médio";
        }
        else if(peso <= 120.2) {
            categoria = "Pesado";
        }
        else {
            categoria = "Inválido";
        }
    }
    public void ganharLuta() {  
        setVitorias(getVitorias() + 1);
    }
    public void perderLuta() {  
        setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
    public void apresentar() {
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Pesando: " + getPeso());
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
    }
}
