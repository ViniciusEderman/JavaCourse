package javacursocode;

public class ExercicioConceitosL {
    public String livro;
    public String autor;
    public int totPags;
    public int pagAtual;
    public boolean aberto; 
    public String leitor;

    public String getLivro() {
        return livro;
    }
    public void setLivro(String l) {
        this.livro = l;
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

    public String getLeitor() {
        return leitor;
    }
    public void setLeitor(String leit) {
        this.leitor = leit;
    }

    public void abrirLivro() {
        if(this.aberto == false) {
            this.aberto = true;
            System.out.println("Livro aberto");
        }
    }

    public void fecharLivro() {

    }

    public void avancarPag() {

    }

    public void voltarPag() {

    }

    public void atualPag() {

    }
}
