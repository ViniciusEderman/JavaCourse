package AulaFinalPooCursoemVideo;

public class Vizualizador extends Individuo {
    
    public Vizualizador(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalView = 0;
    }


    private String login;
    private int totalView;


    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotalView() {
        return totalView;
    }
    public void setTotalView(int totalView) {
        this.totalView = totalView;
    }
    @Override
    public String toString() {
        return "Vizualizador [login=" + login + super.toString() + "\n totalView=" + totalView + "]";
    }
    
}
