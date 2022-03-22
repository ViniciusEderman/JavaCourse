package javacursocode;

public class ExercicioConceitosL {
    public String titulo;
    public String autor;
    public int totPags;
    public int pagAtual;
    public boolean aberto; 
    public ExercicioConceitosP leitor;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String l) {
        this.titulo = l;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String a) {
        this.autor = a;
    }

    public int getTotPaginas() {
        return totPags;
    }
    public void setTotPaginas(int tp) {
        this.totPags = tp;
    }

    public int getPaginaAtual() {
        return pagAtual;
    }
    public void setPaginaAtual(int pa) {
        this.pagAtual = pa;
    }

    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean sn) {
        this.aberto = sn;
    }

    public ExercicioConceitosP getLeitor() {
        return leitor;
    }
     public void setLeitor(ExercicioConceitosP leit) {
        this.leitor = leit;
    }

    public void abrirLivro() {
        if(this.aberto == false) {
            this.aberto = true;
            System.out.println("Livro aberto");
        }
    }

    public void fecharLivro() {
        if(this.aberto == true) {
            this.aberto = false;
            System.out.println("Livro fechado");
        }
    }

    public void avancarPag() {
        if(this.aberto == true) {
            this.pagAtual = +1;
        } else{
            System.out.println("Seu livro está fechado, não há como avançar a página.");
        }
    }

    public void voltarPag() {
        if(this.aberto == true) {
            this.pagAtual = -1;
        } else{
            System.out.println("Seu livro está fechado, não há como avançar a página.");
        }
    }

    public void atualPag() {
        if(this.aberto == true) {
            System.out.println("A sua página atual é: "+ getPaginaAtual());
        }
    }

    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + "autor=" + autor + ", total de paginas=" + totPags + ", pagina atual=" + pagAtual + ", aberto=" + aberto + ", leitor=" + leitor + "}";
    }

    public ExercicioConceitosL(String titulo, String autor, int totalpaginas, boolean aberto, ExercicioConceitosP pessoa, int pagatual) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPags = totalpaginas;
        this.aberto = false;
        this.pagAtual = pagatual;
        this.leitor = pessoa;
    }
}
