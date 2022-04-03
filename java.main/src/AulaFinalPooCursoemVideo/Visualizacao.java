package AulaFinalPooCursoemVideo;

public class Visualizacao {
    private Vizualizador Viewer;
    private Video filme;


    //Contruct:
    public Visualizacao(Vizualizador viewer, Video filme) {
        Viewer = viewer;
        this.filme = filme;
        this.Viewer.setTotalView(this.Viewer.getTotalView() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avalir(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porcent) {
        int i = 0;
        if (porcent <= 20) {
            i = 3;
        } else if(porcent <= 50) {
            i = 5;
        } else if(porcent <= 90) {
            i = 8;
        }else {
            i = 10;
        }
        this.filme.setAvaliacao(i);
    }

    //ToString:
    @Override
    public String toString() {
        return "Visualizacao [Viewer=" + Viewer + ", filme=" + filme + "]";
    }

    //Get's and Set's:
    public Vizualizador getViewer() {
        return Viewer;
    }

    public void setViewer(Vizualizador viewer) {
        Viewer = viewer;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

}
