package javacursocode;
public class ControlRemot implements InterfaceControl {
    // atributes    
    private int volm;
    private boolean ligado;
    private boolean tocando;
    
    // especiais metd
    public ControlRemot() {
        this.volm = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolm() {
        return volm;
    }
    public void setVolm(int volm) {
        this.volm = volm;
    }
    public boolean getLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public boolean getTocando() {
        return tocando;
    }
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public void ligar() {
        // throw new UnsupportedOperationException("Not supported");
        this.setLigado(true);
    }

    public void desligar() {
        // throw new UnsupportedOperationException("Not supported");
        this.setLigado(false);
    }

    public void abrirMenu() {
       // throw new UnsupportedOperationException("Not supported");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolm());
        for (int i = 0; i <= this.getVolm(); i = i+10) {
            System.out.println("|");
        }
    }

    public void fecharMenu() {
        // throw new UnsupportedOperationException("Not supported");
        System.out.println("Fechando menu...");
    }

    public void maisVolm() {
        if (this.getLigado()) {
            this.setVolm(this.getVolm() + 10);
        }
    }

    public void menosVolm() {
        if (this.getLigado()) {
            this.setVolm(this.getVolm() - 10);
        }
    }

    public void ligarMudo() {
        if (this.getLigado() && this.getVolm() > 0) {
            this.setVolm(0);
        }
        else if(this.getLigado() && this.getVolm() == 0){
            System.out.println("Erro: o volume já está no mudo");
        }
        else if(!(this.getLigado())){
            System.out.println("Erro: o controle está desligado");
    }
}

    public void desligarMudo() {   
        if (this.getLigado() && this.getVolm() == 0) {
            this.setVolm(50);
        }
    }

    public void play(){
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
        else if(this.getLigado() && this.getTocando()){
            System.out.println("Aviso: o sistema já está no modo play");
        }
        else if(!(this.getLigado())){
            System.out.println("Erro: o controle está desligado");
        }
    }
    
    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
        else if(this.getLigado() && !(this.getTocando())){
            System.out.println("Aviso: o sistema já está no modo pause");
        }
        else if(!(this.getLigado())){
            System.out.println("Erro: o controle está desligado");
        }
        }
}
