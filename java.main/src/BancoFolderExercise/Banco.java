package BancoFolderExercise;

class Banco {
    // Atributos criado para o banco //

    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private float saldoConta;
    private boolean statusConta;

    // Iniciando os métodos // 
    public void estadoAtual() {
        System.out.println("____________________________");
        System.out.println("Conta: " + this.getnumConta());
        System.out.println("Tipo da conta: " + this.gettipoConta());
        System.out.println("Dono da conta: " + this.getdonoConta());
        System.out.println("Saldo da conta: " + this.getsaldoConta());
        System.out.println("Status atual da conta: " + this.getstatusConta());
    }
    
    public Banco() {
        this.setsaldoConta(0); 
        this.setstatusConta(false); 
    }
    public void setnumConta(int n){
        this.numConta = n;
    }
    public int getnumConta() {
        return numConta;
    }
    public void settipoConta(String t) {
        this.tipoConta = t;
    }
    public String gettipoConta() {
        return tipoConta;
    }
    public void setdonoConta(String d) {
        this.donoConta = d;
    }
    public String getdonoConta() {
        return donoConta;
    }
    public void setsaldoConta(float s) {
        this.saldoConta = s;
    }
    public float getsaldoConta() {
        return saldoConta;
    }
    public void setstatusConta(boolean st) {
        this.statusConta = st;
    }
    public boolean getstatusConta() {
        return statusConta;
    }  
    public void abrirConta(String t) {
        this.settipoConta(t);
        this.setstatusConta(true);
         if (t == "CC") {
             this.setsaldoConta(50.00f); 
         }
         else if (t == "CP") {
             this.setsaldoConta(150.00f); 
         }
         System.out.println("Conta aberta!");
    }
    public void fecharConta() {
        if (this.getsaldoConta() > 0) {
            System.out.println("Conta ainda com dinheiro, não permitido o fechamento");
        }
        else if (this.getsaldoConta() < 0) {
            System.out.println("Conta no negativo, não permitido o fechamento");
        }
        else {
            this.setstatusConta(false);
            System.out.println("Conta fechada");
        }
    }
    public void depositar(float v) {
        if (statusConta == true) {
            saldoConta += v;
            System.out.println("Depósito realizado com sucesso na conta " + this.getdonoConta());
        }
        else {
            System.out.println("Conta fechada, não é possível depositar");
        }
    }
    public void sacar(float v) {
        if (statusConta = true) {
          if(saldoConta >= v) {
              saldoConta = saldoConta - v; 
                System.out.println("Saque realizado com sucesso na conta de " + this.getdonoConta());
          }
          else {
            System.out.println("Saldo insuficiente");
        }
    }
        else {
            System.out.println("Impossível sacar");
        }
    }
    public void pagarMensalidade() {
        float value;
        value = 0;
        // condição para mensalidade // 
         if (tipoConta == "CC") {
             value = 12.00f;
         }
         else if (tipoConta == "CP") {
             value = 20.00f;
         }
         if (statusConta == true) {
           if (saldoConta > value) {
               saldoConta = saldoConta - value;
               System.out.println("Mensalidade paga com sucesso por " + this.getdonoConta());
            }
            else {
              System.out.println("Saldo insuficiente");
            } }
         else {
            System.out.println("Impossível pagar em uma conta fechada");
         }    
    }
} 
