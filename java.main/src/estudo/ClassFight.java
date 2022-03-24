package estudo;
import java.util.Random;

public class ClassFight {
    private LutadorFirstClass desafiado;
    private LutadorFirstClass desafiante;
    private int rounds; 
    private boolean aprovado; 
    
  
    public LutadorFirstClass getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(LutadorFirstClass desafiado) {
        this.desafiado = desafiado;
    }

    public LutadorFirstClass getDesafiante() {
        return desafiante;
    }    
    public void setDesafiante(LutadorFirstClass desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovado() {
        return aprovado;
    }
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public void marcarLuta(LutadorFirstClass l1, LutadorFirstClass l2 ) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) { 
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovado) {
        System.out.println("### Desafiado ###");
        this.desafiado.apresentar();
        System.out.println("### Desafiante ###");
        this.desafiante.apresentar();
        Random aleatorio = new Random();
        int vencedor = aleatorio.nextInt(3);
        System.out.println("=========== Resultado da Luta ===========");
        switch(vencedor) {
            case 0:
                System.out.println("Empatou!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;
            case 1:
                System.out.println("Vitória do " + this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
            case 2:
                System.out.println("Vitória do " + this.desafiante.getNome());
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                break;
        }   
    } else {
        System.out.println("A luta não pode acontecer");
    }
    }
    
}
