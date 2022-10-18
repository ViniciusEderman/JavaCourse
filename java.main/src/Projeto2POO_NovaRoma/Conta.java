package Projeto2POO_NovaRoma;

public class Conta {

    public int numConta;
    protected String tipoConta;
    private float saldoConta;
    private boolean statusConta;

    public void estadoAtual() {
       System.out.println("____________________________");
       System.out.println("Conta: " + this.getnumConta());
       System.out.println("Tipo da conta: " + this.gettipoConta());
       System.out.println("Saldo da conta: " + this.getsaldoConta());
       System.out.println("Status atual da conta: " + this.getstatusConta());
    }

    // construtor:
    public Conta() {
        this.setsaldoConta(0); 
        this.setstatusConta(false); 
    }

    // metodo para criar o número da conta:
    public void setnumConta(int n){
        this.numConta = n;
    }
    // metodo que irá pegar o número da conta:
    public int getnumConta() {
        return numConta;
    }
    // metodo que setta o tipo da conta(poupança ou corrente):
    public void settipoConta(String t) {
        this.tipoConta = t;
    }
    //metodo que pega o tipo de conta(p ou c):
    public String gettipoConta() {
        return tipoConta;
    }

    // metodo de criar um saldo do tipo float
    public void setsaldoConta(float s) {
        this.saldoConta = s;
    }
    // pegando o valor de saldo
    public float getsaldoConta() {
        return saldoConta;
    }
    //metodo que mostra se a conta está aberta ou fechada
    public void setstatusConta(boolean st) {
        this.statusConta = st;
    }
    public boolean getstatusConta() {
        return statusConta;
    }  

    // metodo para criar a conta
    public void abrirConta(String t) {
        this.settipoConta(t);
        this.setstatusConta(true);
         if (t == "CC") {
             this.setsaldoConta(10.00f); // se o user criar uma conta do tipo corrente ele já irá receber um valor de 10.00
         }
         else if (t == "CP") {
             this.setsaldoConta(20.00f); // se o user criar uma conta do tipo poupança ele já irá receber um valor de 20.00
         }
         System.out.println("Conta aberta!");
    }

    // metodo para depositar 
    public void depositar(float v) {
        if (statusConta == true) {
            saldoConta += v;
            saldoConta -= 0.10f;
            System.out.println("\nDepósito realizado com sucesso!");
            System.out.printf("Saldo atual: R$ %.2f\n\n", saldoConta);
        }
        else {
            System.out.println("Conta fechada, não é possível depositar");
        }
    }

    // metodo responsável pelo saque:
    public void sacar(float v) {
        if (statusConta = true) {
          if(saldoConta >= v) {
              saldoConta = saldoConta - v; 
                System.out.println("Saque realizado com sucesso!");
                System.out.printf("Saldo atual: R$ %.2f\n\n", saldoConta);
          }
          else {
            System.out.println("Saldo insuficiente");
        }
    }
        else {
            System.out.println("Impossível realizar o saque");
        }
    }

    public void taxa() {

        float value;
        value = 0;
         
         if (tipoConta == "CC") {
             value = 0.02f;
         }
         else if (tipoConta == "CP") {
             value = 0.06f;
         }
         if (statusConta == true) {
           if (saldoConta > value) {
               saldoConta = saldoConta - value;
               System.out.println("Taxa subtraida do total com sucesso");
               System.out.printf("Saldo atual: R$ %.2f", saldoConta);
            }
            else {
              System.out.println("Saldo insuficiente");
            } }
         else {
            System.out.println("A conta se encontra fechada, abra uma conta!");
         }    
    }
}
