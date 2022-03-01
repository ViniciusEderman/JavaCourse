package estudo;

public class Iphone {
    String modeloFabricado;
    int numModelo;
    boolean descarregado;
    boolean carregado;
    String cor;

    public String getmodeloFabricado() {
        return this.modeloFabricado;
    }
    public void setmodeloFabricado(String mod) {
        this.modeloFabricado = mod;
    }
    public int getnumModelo() {
        return this.numModelo;
    }
    public void setnumModel(int num) {
        this.numModelo = num;
    }
    public void status() {
        System.out.println("Modelo: " + this.modeloFabricado);
        System.out.println("Numeração do modelo: " + this.numModelo);
        System.out.println("Estado do modelo: " + this.carregado);
        System.out.println("Cor do modelo: " + this.cor);
    }
    public Iphone(String m, int num, boolean c, String cr) {
        this.modeloFabricado = m;
        this.numModelo = num;
        this.carregado = c;   
        this.cor = cr;
        this.descarregado();
    }
    public void carregado() {
        this.carregado = true;
    }
    public void descarregado() {
        this.descarregado = false;
    }
    public void cor() {
        this.cor = "Vermelho";
    }
}
